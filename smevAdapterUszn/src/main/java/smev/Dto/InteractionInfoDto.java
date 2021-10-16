package smev.Dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel("Информация взаимодействия")
@Data
public class InteractionInfoDto {
    @ApiModelProperty("MessageId")
    private String messageId;
    @ApiModelProperty("Количество сообщений - запросов")
    private int requestNumber;
    @ApiModelProperty("Количество сообщений - запросов")
    private int responseNumber;
    @ApiModelProperty("Количество статусов")
    private int statusNumber;
    @ApiModelProperty("Количество отказов")
    private int rejectNumber;
    @ApiModelProperty("Количество ошибок")
    private int errorNumber;
    @ApiModelProperty("Статус сообщения")
    private String status;

}

