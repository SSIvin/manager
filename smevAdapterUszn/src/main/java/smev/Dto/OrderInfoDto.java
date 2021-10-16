package smev.Dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel("Информация и заявлении")
@Data
public class OrderInfoDto {
    @ApiModelProperty("OrderId")
    private String orderId;

    @ApiModelProperty("Количество заявлений в процессе")
    private int processNumber;

    @ApiModelProperty("Количество заявлений c предупреждением")
    private int warningNumber;

    @ApiModelProperty("Количество ВС у которых выщло время ожидания ответа")
    private int timeOutNumber;

    @ApiModelProperty("Количество заявлений успешных")
    private int successNumber;

    @ApiModelProperty("Количество заявлений с ошибками")
    private int errorNumber;

    @ApiModelProperty("Статус заявления")
    private String status;

}

