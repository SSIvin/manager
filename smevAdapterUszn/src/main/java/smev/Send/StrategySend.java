package smev.Send;

import org.w3c.dom.Element;
import smev.Wrapper.ObjectMessage;

import javax.xml.transform.TransformerException;

public class StrategySend {
    SendingRequest sendingRequest;

    public void setSendingRequest(SendingRequest sendingRequest) {
        this.sendingRequest = sendingRequest;
    }

    public void executeStrategy(Element req, ObjectMessage metaData) {
        try {
            sendingRequest.Send(req, metaData);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
