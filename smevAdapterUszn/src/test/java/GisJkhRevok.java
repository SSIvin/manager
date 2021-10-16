import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.w3c.dom.Element;
import smev.ElementServices.GisJKH.BaseResultType;
import smev.ElementServices.GisJKH.ImportDebtRequestsRequest;
import smev.ElementServices.GisJKH.ImportDebtRequestsResponse;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.*;
import smev.GisJkh.Converter.GisJkhConverter;
import smev.GisJkh.Dto.revokDto;
import smev.GisJkh.Service.GisJkhServiceImpl;
import smev.Marshaller.Marshaller;
import smev.Service.CreateMessageService;
import smev.Service.MessageService;
import smev.SmevApplication;
import smev.Wrapper.PayLoad;
import smev.dao.SmevDaoImpl;
import smev.utils.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
public class GisJkhRevok {

    private static final Logger log = LogManager.getLogger("GisJkh");

    @Autowired
    private MessageService messageService;

    @Autowired
    private SmevDaoImpl smevDao;


    @Autowired
    private GisJkhServiceImpl gisJkhService;

    @Autowired
    private CreateMessageService createMessageService;


    @Test
    public void testRevok() throws Exception {
        List<String> list = smevDao.GetContentStringForRevok();
        List<revokDto> originalList = new ArrayList<>();

        for (String content : list) {
            Element element = util.toElement(content);
            ImportDebtRequestsResponse pac = (ImportDebtRequestsResponse) Marshaller.unmarshal(element);
            if (!pac.getResult().isEmpty()) {
                for (BaseResultType result : pac.getResult()) {
                    if (result.getSuccess() != null) {
                        revokDto revokDto = new revokDto();
                        revokDto.setTransportId(UUID.fromString(result.getTransportId()));
                        revokDto.setRequestId(UUID.fromString(result.getSuccess().getId()));
                        originalList.add(revokDto);
                    }
                }
            }
        }

        List<List<revokDto>> partitions = new LinkedList<List<revokDto>>();

        for (int i = 0; i < originalList.size(); i += 50) {
            partitions.add(originalList.subList(i,
                    Math.min(i + 50, originalList.size())));
        }
        for (List<revokDto> revokPackage : partitions) {

            ImportDebtRequestsRequest request = new ImportDebtRequestsRequest();
            request.setAction(GisJkhConverter.MAPPER.toActionListForRevok(revokPackage));
            request.setInformationSystemId("b14041c6-07e2-4ba9-8972-6e099497ef87");
            request.setOrganizationId("9c774143-440b-4161-bf8e-9cd046032ca0");

            PayLoad payLoad = new PayLoad();
            payLoad.setPayLoadObject(request);
            BusinessMessageEntity messageEntity = createMessageService.autoCreateRequestMessage(InquiryVersionEnum.GIS_JKH_IMPORT_REQUEST, 1111, null, payLoad);
            log.info("автоматически успешно создано взаимодействие для отмены для ГИС ЖКХ {}, {}", messageEntity.getInteractionId(), InquiryVersionEnum.GIS_JKH_IMPORT_REQUEST.name());
//            dataRequestRepo.saveAll(GisJkhConverter.MAPPER.toDataRequestEntityList(requestPackage));



        }
    }
}
