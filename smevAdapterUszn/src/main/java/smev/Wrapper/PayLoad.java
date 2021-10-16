package smev.Wrapper;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smev.Entity.Subject;
import smev.GisJkh.payLoadRequest;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "typePayLoad")
@JsonSubTypes({
        @JsonSubTypes.Type(value = payLoadRequest.class, name = "gisJkh")
})
public class PayLoad {

    public Subject subject;

    public Object payLoadObject;

    private  LoadData  loadData;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Object getPayLoadObject() {
        return payLoadObject;
    }

    public void setPayLoadObject(Object payLoadObject) {
        this.payLoadObject = payLoadObject;
    }
}
