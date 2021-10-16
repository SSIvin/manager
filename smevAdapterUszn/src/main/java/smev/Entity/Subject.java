package smev.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subject {

    @JsonProperty("ID_BASE")
    private Integer ID_BASE;

    @JsonProperty("ID_REGION")
    private Integer ID_REGION;

    @JsonProperty("ID_SUBJECT")
    private Integer ID_SUBJECT;

    @JsonProperty("surname")
    private String Surname;

    @JsonProperty("name")
    private String Name;

    @JsonProperty("secname")
    private String Secname;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate birthDay;

}
