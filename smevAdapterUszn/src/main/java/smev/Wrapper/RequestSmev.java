package smev.Wrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smev.Entity.Subject;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class RequestSmev {

    private int idAdapter;
    private String idSend;
    private int typeRequest;
    private String nameTypeRequest;
    private Subject subject;
    private String idResponse;
    private String description;
}
