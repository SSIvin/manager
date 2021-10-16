package smev.Enum;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Статус (тип) содержимого сообщений
 */
@XmlType(name = "MessageType")
@XmlEnum
public enum MessageType {

    @XmlEnumValue("RESPONSE")
    RESPONSE("RESPONSE"),


    @XmlEnumValue("REQUEST")
    REQUEST("REQUEST"),

    /**
     * Отклонение обработки запроса
     */
    @XmlEnumValue("RejectMessage")
    REJECT_MESSAGE("RejectMessage"),

    /**
     * Получение статуса
     */
    @XmlEnumValue("StatusMessage")
    STATUS_MESSAGE("StatusMessage"),

    /**
     * Сообщение в котором содержится ответ
     *
     */
    @XmlEnumValue("PrimaryMessage")
    PRIMARY_MESSAGE("PrimaryMessage"),

    /**
     * Запрос с таким Id не найден в БД СМЭВ.
     *
     */
    @XmlEnumValue("doesNotExist")
    DOES_NOT_EXIST("doesNotExist"),

    /**
     * Запрос находится в очереди на асинхронную валидацию.
     *
     */
    @XmlEnumValue("requestIsQueued")
    REQUEST_IS_QUEUED("requestIsQueued"),

    /**
     * Запрос доставляется поставщику.
     *
     */
    @XmlEnumValue("requestIsAcceptedBySmev")
    REQUEST_IS_ACCEPTED_BY_SMEV("requestIsAcceptedBySmev"),

    /**
     * Запрос не прошёл асинхронную валидацию.
     *
     */
    @XmlEnumValue("requestIsRejectedBySmev")
    REQUEST_IS_REJECTED_BY_SMEV("requestIsRejectedBySmev"),

    /**
     * Обрабатывается поставщиком сервиса.
     *
     */
    @XmlEnumValue("underProcessing")
    UNDER_PROCESSING("underProcessing"),

    /**
     * Запрос выполнен ответ находится в очереди СМЭВ.
     *
     */
    @XmlEnumValue("responseIsAcceptedBySmev")
    RESPONSE_IS_ACCEPTED_BY_SMEV("responseIsAcceptedBySmev"),

    /**
     * Запрос не прошёл асинхронную валидацию.
     *
     */
    @XmlEnumValue("responseIsRejectedBySmev")
    RESPONSE_IS_REJECTED_BY_SMEV("responseIsRejectedBySmev"),

    /**
     * Запрос отменён сервисом.
     *
     */
    @XmlEnumValue("cancelled")
    СANCELLED("cancelled"),

    /**
     * Сообщение переведено в архив.
     *
     */
    @XmlEnumValue("messageIsArchived")
    MESSAGE_IS_ARCHIVED("messageIsArchived"),

    /**
     * Неизвестный тип
     */

    UNKNOWN(""),

    /**
     * Сообщение получено получателем.
     *
     */
    @XmlEnumValue("messageIsDelivered")
    MESSAGE_IS_DELIVERED("messageIsDelivered");

    private final String value;


    MessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageType fromValue(String v) {
        for (MessageType c: MessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
