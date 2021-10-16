package smev.Service;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.InquiryVersionEnum;
import smev.Reestr.Dto.OrderInquiryDto;
import smev.Strategy.DefaultReceiveStrategy;
import smev.dao.EntitySmev.DataSubjectEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Log4j2
public class ReceiveMessageService {

//    private static final Logger log = LoggerFactory.getLogger("smev.GisJkh");



    @Value("${spring.profiles.active}")
    public String profileActive;


    private Map<String, ReceiveMessageStrategy> map;


    @Autowired
    public ReceiveMessageService(List<ReceiveMessageStrategy> strategyCreateObjectMessageList) {
        Map<String, ReceiveMessageStrategy> result = new HashMap<>();
        for (ReceiveMessageStrategy o : strategyCreateObjectMessageList) {
            result.putIfAbsent(o.getIdInquery(), o);
//            if (result.putIfAbsent(o.getIdInquery(), o) != null) {
//                throw new IllegalStateException("Duplicate key");
//            }
        }
        map = result;
    }


    public void autoReceiveMessage(InquiryVersionEnum inquiryVersionEnum, BusinessMessageEntity message) throws Exception {
        if (!InquiryVersionEnum.UNKNOWN.equals(inquiryVersionEnum)) {
            ReceiveMessageStrategy receiveMessageService = map.getOrDefault(inquiryVersionEnum.idInquiry().toString().toLowerCase(), new DefaultReceiveStrategy());
            receiveMessageService.runReceive(inquiryVersionEnum, message);
        }
    }

    public DataSubjectEntity autoReceiveMessageOrder(BusinessInteractionEntity interactionEntity, OrderInquiryDto orderInquiryDTO) throws Exception {
        if (!InquiryVersionEnum.UNKNOWN.equals(interactionEntity.getInquiryVersion())) {
            ReceiveMessageStrategy receiveMessageService = map.getOrDefault(interactionEntity.getInquiryVersion().getId().toString().toLowerCase(), new DefaultReceiveStrategy());
//            if (receiveMessageService == null) {
//                log.error("стратегия разбора взаимодействия по ВС {} (UUID = {}) не реализованна", InquiryVersionEnum.InquiryById(orderInquiryEntity.getInquiryId()).name(),orderInquiryEntity.getInquiryId());
//                return null;
//            }
            return receiveMessageService.runReceiveOrder(interactionEntity, orderInquiryDTO);
        }
        return null;
    }

}
