package smev.Dto;

/*     */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.UUID;


@ApiModel("Настройки сообщения")
@Data
public class MessageSettingsDto {

    @ApiModelProperty("Идентификатор")
    private UUID id;

    @ApiModelProperty("Идентификатор вида сведений")
    private UUID inquiryVersionId;

    @ApiModelProperty("Режим")
    private String mode;

    @ApiModelProperty("Источник")
    private String source;

    @ApiModelProperty("Из")
    private String from;

    @ApiModelProperty("Корневой элемент сообщения")
    private String rootElement;

    @ApiModelProperty("Корневой элемент данных")
    private String contentElement;

    @ApiModelProperty("Вложения")
    private Boolean attachments;

    @ApiModelProperty("Персональная подпись")
    private Boolean personalSignature;

    @ApiModelProperty("Динамическая маршрутизация")
    private Boolean dynamicRouting;

    @ApiModelProperty("Маршрутизация по идентификаторам")
    private Boolean identifierRouting;


}

