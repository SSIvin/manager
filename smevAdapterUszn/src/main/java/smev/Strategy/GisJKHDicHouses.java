//package smev.Strategy;
//
//
//import lombok.Data;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import smev.ElementServices.GisJKH.raoHouses.ExportRAOHousesRequest;
//import smev.Entity.Subject;
//import smev.Enum.*;
//import smev.Reestr.Service.ReestrService;
//import smev.Service.BusinessService;
//import smev.Service.CreateMessageStrategy;
//import smev.Service.MessageService;
//import smev.Wrapper.ObjectMessage;
//import smev.Wrapper.RequestExportRAOHousesRequest;
//
//
//@Component
//@Log4j2
//@Data
//public class GisJKHDicHouses implements CreateMessageStrategy {
//
//    @Autowired
//    private MessageService messageService;
//
//    @Autowired
//    private BusinessService businessService;
//
//    @Autowired
//    ReestrService reestrService;
//
//    @Override
//    public ObjectMessage create(Subject subject) {
//
//        ObjectMessage message = new RequestExportRAOHousesRequest();
////        ExportRAOHousesRequest raoHousesRequest = new ExportRAOHousesRequest();
////        raoHousesRequest.setOktmo(new ExportRAOHousesRequest.Oktmo());
////        ((RequestExportRAOHousesRequest) message).setData(raoHousesRequest);
//
//        return message;
//
//    }
//
//    @Override
//    public String getIdInquery() {
//        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.GIS_JKH_HOUSES).toString();
//    }
//}
