package smev.dao.EntitySmev;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import smev.Enum.InteractionType;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "INQUIRY_VERSION", schema = "dbo")
public class InquiryVersionEntity {

    @Id
    @Column(name = "ID", nullable = false)
    @Type(type = "uuid-char")
    private UUID id;
//    private UUID schemaFileId;
//    private String schemaLocation;
    @Column(name = "NAMESPACE")
    private String namespace;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "VERSION")
    private String version;
//    private UUID appliedSettingsFileId;
    @Column(name = "TEST_MESSAGE")
    private Boolean testMessage;

    @Column(name = "INTERACTION_TYPE")
    @Enumerated(EnumType.STRING)
    private InteractionType interactionType;

    @Column(name = "PERSON")
    private Boolean person;

    @Column(name = "PERSONAL_SIGNATURE")
    private Boolean personalSignature;

    @Column(name = "ENABLE")
    private Boolean enable;

    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    @Column(name = "CHANGE_DATE")
    private LocalDateTime changeDate;


}
