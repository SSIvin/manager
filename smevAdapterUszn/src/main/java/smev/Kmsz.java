package smev;

import lombok.Builder;
import org.apache.axis.message.MessageElement;
import smev.ElementServices.Other.Content;
import smev.ElementServices.Other.MessagePrimaryContent;

import javax.xml.soap.SOAPException;

@Builder
public class Kmsz {

    public Content reqGetSnils() {
        return null;

    }

    public Content reqGetKmsz() {
        Content content = new Content();
        MessagePrimaryContent messagePrimaryContent = new MessagePrimaryContent();
        MessageElement[] m = new MessageElement[]{
                new MessageElement(
                        "request",
                        "em",
                        "urn://egisso-ru/msg/10.02.I/1.0.2"
                )};

        MessageElement messageElement = new MessageElement(
                "classifierCode",
                "etcr",
                "urn://egisso-ru/types/cls-request/1.0.2"
        );
        messageElement.setValue("010");
        try {
            m[0].addChild(messageElement);
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        //messagePrimaryContent.setAny(m);
        //messagePrimaryContent.set_any(doc.getFirstChild());
        content.setMessagePrimaryContent(messagePrimaryContent);
        return content;
    }

}
