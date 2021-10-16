package smev.Egisso.Elements.ElementsProtocol;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "recID",
        "recordOK",
        "recordError",
        "messages"
})
@XmlRootElement(name = "recordResult")
@Data
public class RecordResult {

    @XmlElement(required = true)
    protected String recID;

    @XmlElement(required = true)
    private Boolean recordOK;

    @XmlElement()
    protected List<Messages> messages;

    @XmlElement()
    protected List<RecordError> recordError;

    public List<RecordError> getRecordError() {
        if (recordError == null) {
            return new ArrayList<>();
        }
        return  recordError;
    }


    public List<Messages> getMessages() {
        if (messages == null) {
            return new ArrayList<>();
        }
        return  messages;
    }

    public void setMessages(List<Messages> messages) {
        this.messages = messages;
    }

    /*
    public Messages getMessages() {
        if (messages == null) {
            return messages;
        }
        return  null;
    }

    public void setMessages(Messages messages) {
        this.messages = messages;
    }*/

    public String getRecID() {
        return recID;
    }

    public void setRecID(String recID) {
        this.recID = recID;
    }


    public boolean isRecordOK() {
        return recordOK;
    }

    public void setRecordOK(boolean recordOK) {
        this.recordOK = recordOK;
    }


}
