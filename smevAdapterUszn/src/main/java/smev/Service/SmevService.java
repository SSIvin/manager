package smev.Service;


import org.w3c.dom.Element;
import smev.ElementServices.infoEgissoBySnils.Request;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Wrapper.ObjectMessage;
import smev.Wrapper.RequestSmev;

import javax.xml.transform.TransformerException;
import java.util.List;

public interface SmevService {

    String GetSnils(Long idAdapter);

    Request GetInfoEgissoBySnils(Long idAdapter);

    void saveMessage(Element bussinesData, ObjectMessage req) throws TransformerException;

    List<RequestSmev> GetListRequestSmev();

    Element GetDOHFLNAResponse(Long idAdapter);

    void saveMessage(BusinessMessageEntity messageEntity);

    String generateContent(BusinessMessageEntity messageEntity);

}
