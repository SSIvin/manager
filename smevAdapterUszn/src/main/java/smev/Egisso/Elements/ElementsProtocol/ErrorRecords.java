package smev.Egisso.Elements.ElementsProtocol;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "recordResult"
})
@XmlRootElement(name = "errorRecords")
@Data
public class ErrorRecords {

    @XmlElement(required = true)
    protected List<RecordResult> recordResult;

    public List<RecordResult> getRecordResult() {

        if (recordResult == null) {
            recordResult = new ArrayList<RecordResult>();
        }
        return recordResult;
    }

    public void setRecordResult(List<RecordResult> recordResult) {
        this.recordResult = recordResult;
    }
}
