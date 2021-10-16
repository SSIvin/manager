//package ru.uszn.demo.Service.Impl;
//
//

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import ru.uszn.demo.Service.SmevAdapterService;
//import ru.uszn.smev.adapterSMEV.ClientMessage;
//import ru.uszn.smev.adapterSMEV.SMEVServiceAdapterPortType;
//import ru.uszn.smev.adapterSMEV.SMEVServiceAdapterServiceLocator;
//
//import javax.xml.rpc.ServiceException;
//import java.rmi.RemoteException;
//
//@Service
//@Transactional(value = "jdbcSmevTransactionManager")
//public class SmevAdapterServiceImpl implements SmevAdapterService {
//
//    private static final Logger log = LogManager.getLogger(SmevAdapterServiceImpl.class);
//
//    @Value("${smev.adapter.mnemonicIS}")
//    public String mnemonicIS;
//
//    public static String adpterEndPoint_adress;
//
//    @Value("${smev.adapter.adpterEndPoint_adress}")
//    public void setAdpterEndPoint_adress(String adpterEndPoint_adress) {
//        this.adpterEndPoint_adress = adpterEndPoint_adress;
//    }
//
//    private volatile static SMEVServiceAdapterPortType serviceSmev;
//
//
//    public static SMEVServiceAdapterPortType getInstanceSmevService() {
//        if (serviceSmev==null) {
//            synchronized (SmevAdapterServiceImpl.class) {
//                if (serviceSmev == null) {
//                    SMEVServiceAdapterServiceLocator locator = new SMEVServiceAdapterServiceLocator(adpterEndPoint_adress);
//                    try {
//                        serviceSmev = locator.getSMEVServiceAdapterEndpoint();
//                    } catch (ServiceException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//        return serviceSmev;
//
////        try {
////            if (serviceSmev == null) {
////                SMEVServiceAdapterServiceLocator locator = new SMEVServiceAdapterServiceLocator(adpterEndPoint_adress);
////                serviceSmev = locator.getSMEVServiceAdapterEndpoint();
////            }
////            return serviceSmev;
////        } catch (ServiceException e) {
////            e.printStackTrace();
////        }
////        return null;
//    }
//
//    @Override
//    public void send(ClientMessage clientMessage) {
//        SMEVServiceAdapterPortType instanceSmevService = getInstanceSmevService();
//        if (instanceSmevService != null) {
//            try {
//                instanceSmevService.send(clientMessage);
//            } catch (RemoteException e) {
//                log.error("Ошибка отправки запроса",e);
//                e.printStackTrace();
//            }
//        }
//    }
//
//
////            ClientMessage clientMessage = new ClientMessage();
////            RequestMessageType requestMessageType = new RequestMessageType();
////            clientMessage.setItSystem("001301_3T");
////            clientMessage.setRequestMessage(requestMessageType);
////
////            RequestMetadataType metadataType = new RequestMetadataType();
////            metadataType.setTestMessage(true);
////            metadataType.setClientId(UUID.randomUUID().toString());
////            requestMessageType.setRequestMetadata(metadataType);
////
////            RequestContentType requestContentType = new RequestContentType();
////            Content content = new Content();
//////            AttachmentHeaderType attachmentHeaderType2 = new AttachmentHeaderType();
//////            AttachmentHeaderType[] attachmentHeaderType = new AttachmentHeaderType[]{attachmentHeaderType2};
//////            attachmentHeaderType[0].setFilePath("C:\\01\\111.xml");
//////            content.setAttachmentHeaderList(attachmentHeaderType);
////            MessagePrimaryContent messagePrimaryContent = new MessagePrimaryContent();
////
////            MessageElement[] m = new MessageElement[]{
////                    new MessageElement(
////                            "request",
////                            "em",
////                            "urn://egisso-ru/msg/10.02.I/1.0.2"
////                    )};
////
////            MessageElement messageElement = new MessageElement(
////                    "classifierCode",
////                    "etcr",
////                    "urn://egisso-ru/types/cls-request/1.0.2"
////            );
////            messageElement.setValue("010");
////            m[0].addChild(messageElement);
////
////            messagePrimaryContent.set_any(m);
////            content.setMessagePrimaryContent(messagePrimaryContent);
////            requestContentType.setContent(content);
////            requestMessageType.setRequestContent(requestContentType);
//
//
////            if (smevService != null)
////            { smevService.send(clientMessage);}
//
//
////        Unmarshaller jaxbUnmarshaller = null;
////        try {
////            NamespaceFilter inFilter = new NamespaceFilter(null, false);
////            org.xml.sax.XMLReader reader = XMLReaderFactory.createXMLReader();
////            inFilter.setParent(reader);
////            JAXBContext jaxbContext = JAXBContext.newInstance(QueryResult.class);
////            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
////            InputSource inputSource = new InputSource(new StringReader(xmlFile.xmlFromBase));
////            SAXSource source = new SAXSource(inFilter, inputSource);
////
////            QueryResult res = (QueryResult) jaxbUnmarshaller.unmarshal(source);
////
////            //Element element = res.getResponseMessage().getResponse().getSenderProvidedResponseData().getMessagePrimaryContent().getAny();
////
////            //NamespaceFilter inFilter = new NamespaceFilter(null, false);
////            //org.xml.sax.XMLReader reader = XMLReaderFactory.createXMLReader();
////            //inFilter.setParent(reader);
////            JAXBContext jaxbContext2 = JAXBContext.newInstance(ResponseNamespace.class);
////            jaxbUnmarshaller = jaxbContext2.createUnmarshaller();
////            //InputSource is2 = new InputSource(new FileInputStream(filePath.toString()));
//////            is2.setByteStream();
//////            SAXSource source2 = new SAXSource(inFilter,);
////            //ResponseNamespace res2 = (ResponseNamespace) jaxbUnmarshaller.unmarshal(element);
////            log.info("ggg");
////        } catch (Exception e) {
////            e.printStackTrace();
////            log.error(e.getMessage());
////        }
//
//
//}
