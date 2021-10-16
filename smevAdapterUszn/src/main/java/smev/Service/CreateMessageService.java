package smev.Service;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Entity.Subject;
import smev.Enum.InquiryVersionEnum;
import smev.Strategy.DefaultCreateStrategy;
import smev.Wrapper.ObjectMessage;
import smev.Wrapper.PayLoad;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Log4j2
public class CreateMessageService {


    @Value("${spring.profiles.active}")
    public String profileActive;

    private Map<String, CreateMessageStrategy> map;


    @Autowired
    public CreateMessageService(List<CreateMessageStrategy> strategyCreateObjectMessageList) {
        Map<String, CreateMessageStrategy> result = new HashMap<>();
        for (CreateMessageStrategy o : strategyCreateObjectMessageList) {
            if (result.put(o.getIdInquery(), o) != null) {
                throw new IllegalStateException("Duplicate key");
            }
        }
        map = result;
    }


    public BusinessMessageEntity autoCreateRequestMessage(InquiryVersionEnum inquiryVersionEnum, Integer userId, Subject subject, PayLoad payLoad) throws Exception {
        CreateMessageStrategy messageCreateStrategy = map.getOrDefault(inquiryVersionEnum.idInquiry().toString(), new DefaultCreateStrategy());
        return messageCreateStrategy.run(userId,inquiryVersionEnum.idInquiry(),subject, payLoad);
    }

    public ObjectMessage autoCreateRequestMessageOrder(InquiryVersionEnum inquiryVersionEnum, BusinessMessageEntity messageEntity, PayLoad payLoad) throws Exception {
        CreateMessageStrategy messageCreateStrategy = map.getOrDefault(inquiryVersionEnum.idInquiry().toString(), new DefaultCreateStrategy());
        return messageCreateStrategy.runOrder(messageEntity,inquiryVersionEnum.idInquiry(), payLoad);
    }


}
