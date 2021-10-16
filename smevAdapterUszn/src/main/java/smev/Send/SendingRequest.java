package smev.Send;

import org.w3c.dom.Element;
import smev.Wrapper.ObjectMessage;

import javax.xml.transform.TransformerException;

public interface SendingRequest {

    void Send(Element bussinesData, ObjectMessage req) throws TransformerException;
}
