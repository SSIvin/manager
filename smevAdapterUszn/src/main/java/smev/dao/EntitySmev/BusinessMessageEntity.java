package smev.dao.EntitySmev;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import smev.Enum.*;
import smev.Wrapper.ObjectMessage;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "MESSAGE", schema = "dbo")
public class BusinessMessageEntity {

    @Id
    @Column(name = "ID_MESSAGE", nullable = false)
    @Type(type = "uuid-char")
    private UUID idMessage;

    @Column(name = "SEND_ID")
    @Type(type = "uuid-char")
    private UUID sendId;

    @Column(name = "RECEIVE_ID")
    @Type(type = "uuid-char")
    private UUID receiveId;

    @Column(name = "INTERACTION_ID")
    @Type(type = "uuid-char")
    private UUID interactionId;

    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "REFERENCE_ID")
    @Type(type = "uuid-char")
    private UUID referenceId;

    @Column(name = "DIRECTION")
    @Enumerated(EnumType.STRING)
    private MessageDirection direction; //INCOMING, OUTGOING

    @Column(name = "MODE")
    @Enumerated(EnumType.STRING)
    private MessageMode mode; //MESSAGE, STATUS, REJECT ,ERROR

    @Column(name = "TYPE")
    @Enumerated(EnumType.STRING)
    private MessageType type; //REQUEST, RESPONSE

    @Column(name = "STATE")
    @Enumerated(EnumType.STRING)
    private MessageState state; //DRAFT, SENDING,SENT, UNSENT,RECEIVED, READ

    @Column(name = "CONTENT_ID")
    @Type(type = "uuid-char")
    private UUID contentId;

    @Transient
    private String content;

    @Transient
    private ObjectMessage objectMessage;

    @Column(name = "SMEV_MESSAGE_ID")
    @Type(type = "uuid-char")
    private UUID smevMessageId;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CODE")
    private String code;

    @Column(name = "PERSONAL_SIGNATURE")
    private Boolean personalSignature;

    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    @Column(name = "CHANGE_DATE")
    private LocalDateTime changeDate;

    public BusinessMessageEntity() {
    }


}
