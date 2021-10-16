package smev.Reestr.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDataDTO {

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
    private LocalDate birthday;

    @JsonProperty("docName")
    private String docName;

    @JsonProperty("docCodeReestr")
    private Integer docCodeReestr;

    @JsonProperty("docDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate docDate;

    @JsonProperty("issueName")
    private String issueName;

    @JsonProperty("docSeries")
    private String docSeries;

    @JsonProperty("docNumber")
    private String docNumber;

    @JsonProperty("snils")
    private String snils;

    @JsonProperty("inn")
    private String inn;

    @JsonProperty("sex")
    private String sex;

}
