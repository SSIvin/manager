package smev.Reestr.Entity2;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class NalogMnogodetEntity {
    private Short idRegion;
    private Integer idSubject;
    private Integer idSubChild;
    private String parDelo;
    private String childDelo;
    private String parInn;
    private String parSnils;
    private LocalDate parBirthday;
    private String parSurname;
    private String parName;
    private String parSecname;
    private String parDocType;
    private String parDocumentSerie;
    private String parDocumentNumber;
    private LocalDate parDocumentDate;
    private String parDocumentSource;
    private String childInn;
    private String childSnils;
    private LocalDate childBirthday;
    private String childSurname;
    private String childName;
    private String childSecname;
    private String childDocType;
    private String childDocumentSerie;
    private String childDocumentNumber;
    private LocalDate childDocumentDate;
    private String childDocumentSource;
    private Integer typeDocFile;
    private Integer kolDocs;
    private UUID idDoc;
    private Integer countChild;
    private LocalDate datedoc;
    private LocalDate dateClosed;
}
