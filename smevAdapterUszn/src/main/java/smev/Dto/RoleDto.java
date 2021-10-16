package smev.Dto;

/*    */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto
{
  private Integer id;
  private String name;
  private String description;


}
