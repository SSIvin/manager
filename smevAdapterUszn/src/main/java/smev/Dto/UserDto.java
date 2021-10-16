package smev.Dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@ApiModel("Пользователь")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    //   @ApiModelProperty("Идентификатор")
    private Integer id;
    //   @ApiModelProperty("Имя")
    private String userName;
    //@ApiModelProperty("Пароль")
    private String fioUser;
    private String password;
    //   @ApiModelProperty("Полное имя")
//   private String fioUser;
//   private LocalDateTime creationDate;
//   @ApiModelProperty("Наличие блокировки")
    private Boolean active;
    private Integer idRegion;

    @ApiModelProperty("Набор Ролей у пользователя")
    private Set<RoleDto> roles = new HashSet<>();

    @ApiModelProperty("Набор прав для просмотра у пользователя")
    private Set<RoleViewDto> roleView = new HashSet<>();


}
