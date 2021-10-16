 package smev.converters;



import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import smev.Dto.UserDto;
import smev.Entity.UserEntity;

import java.util.List;

 @Mapper(uses = {RoleConverter.class})
 public interface UserConverter
 {
  public static final UserConverter MAPPER = (UserConverter)Mappers.getMapper(UserConverter.class);

   UserDto userEntityToDto(UserEntity paramUserEntity);

   UserEntity userDtoToEntity(UserDto paramUserDto);

   List<UserDto> entityListToDtoList(List<UserEntity> paramList);

   List<UserEntity> dtoListToEntityList(List<UserDto> paramList);
 }


/* Location:              F:\Java_project\01_work\01 temp\smev-adapter\BOOT-INF\lib\3.1.7\model-3.1.7.jar!\ru\rtlabs\smev3\adapter\common\model\converter\\ui\UserConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
