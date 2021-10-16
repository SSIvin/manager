package smev.FRI.Service;


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import smev.dao.EntitySmev.InquiryVersionEntity;
import smev.Enum.InteractionType;
import smev.FRI.Strategy.DefaultStrategy;
import smev.Service.BusinessService;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Log4j2
public class BroadcastService {



    @Value("${spring.profiles.active}")
    public String profileActive;


    @Autowired
    private BusinessService businessService;

    //@Autowired
    private Map<String, BroadcastStrategy> map;

    //    @Resource(name = "broadcastEgissoDeath")
//    BroadcastEgissoDeath broadcastEgissoDeath;
//
//    @Resource(name = "broadcastInitiativeDistribution")
//    BroadcastInitiativeDistribution broadcastInitiativeDistribution;
    @Autowired
    public BroadcastService(List<BroadcastStrategy> broadcastStrategys) {
        map = broadcastStrategys.stream().collect(Collectors.toMap(o -> o.getIdInquery(), Function.identity()));
    }

//    @Autowired
//    private Map<String, BroadcastStrategy> map2;

    //@Scheduled(fixedRate = 2000)
    public void getInquiryBroadcastList() {

        if (profileActive.equals("prodBase")) {
            return;
        }

        List<InquiryVersionEntity> inquiryVersionList = businessService.getInquiryVersions()
                .stream()
                .filter(inquiryVersionEntity -> inquiryVersionEntity.getInteractionType().equals(InteractionType.BROADCAST))
                .filter(inquiryVersionEntity -> inquiryVersionEntity.getEnable().equals(Boolean.TRUE))
                .collect(Collectors.toList());

//        List<String> stringList = new ArrayList<>();
//        for (InquiryVersionEntity entity : inquiryVersionList) {
//            stringList.add(util.UUIDtoString(entity.getId()));
////            stringList.add(InquiryVersionEnum.InquiryById(util.UUIDtoString(entity.getId())).name());
//        }
//
        /*приведем к виду IN('','','') для SQL*/
//        String InquirySeparator = inquiryVersionList.
//                stream()
//                .map(inquiryVersionEntity -> util.UUIDtoString(inquiryVersionEntity.getId()))
//                .collect(Collectors.joining("\',\'", "\'", "\'"));
        for (InquiryVersionEntity inquiryVersionEntity : inquiryVersionList) {

            BroadcastStrategy broadcastStrategy = map.getOrDefault(inquiryVersionEntity.getId().toString(), new DefaultStrategy());
            broadcastStrategy.reading();


//            switch (InquiryVersionEnum.InquiryById(inquiryVersionEntity.getId())) {
//                case DEATH_EGISSO:
//                    broadcastStrategy = broadcastEgissoDeath;
//                    broadcastStrategy.reading();
//                    break;
//                case INITIATIVE_distribution:
//                    broadcastStrategy = broadcastInitiativeDistribution;
//                    broadcastStrategy.reading();
//                    break;
//                case UNKNOWN:
//                    log.info("Рассылка {} не описана в задании", util.UUIDtoString(inquiryVersionEntity.getId()));
//                    break;
//            }
        }
    }


}
