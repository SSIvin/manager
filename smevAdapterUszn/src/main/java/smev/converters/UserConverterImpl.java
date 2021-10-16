package smev.converters;


import org.mapstruct.factory.Mappers;
import smev.Dto.UserDto;
import smev.Entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class UserConverterImpl
        implements UserConverter {
    private final RoleConverter roleConverter = (RoleConverter) Mappers.getMapper(RoleConverter.class);


    public UserDto userEntityToDto(UserEntity entity) {
        if (entity == null) {
            return null;
        }
        UserDto userDto = new UserDto();

        userDto.setId(entity.getId());
        userDto.setUserName(entity.getUserName());
        userDto.setPassword(entity.getPassword());
        userDto.setFioUser(entity.getFioUser());
        userDto.setActive(Boolean.valueOf(entity.isBlocked()));
        userDto.setIdRegion(entity.getIdRegion());
        userDto.setRoles(this.roleConverter.userEntityToDto(entity.getRoles()));
        userDto.setRoleView(this.roleConverter.RoleViewEntityToDto(entity.getRoleView()));
//    userDto.setCreationDate(entity.getCreationDate());
        return userDto;
    }


    public UserEntity userDtoToEntity(UserDto dto) {
        if (dto == null) {
            return null;
        }
        UserEntity userEntity = new UserEntity();
        userEntity.setId(dto.getId());
        userEntity.setUserName(dto.getUserName());
        userEntity.setPassword(dto.getPassword());
        userEntity.setFioUser(dto.getFioUser());
        if (dto.getActive() != null) {
            userEntity.setBlocked(dto.getActive().booleanValue());
        }
        userEntity.setIdRegion(dto.getIdRegion());
        userEntity.setRoles(this.roleConverter.userDtoToEntity(dto.getRoles()));
//     userEntity.setCreationDate(dto.getCreationDate());
        return userEntity;
    }


    public List<UserDto> entityListToDtoList(List<UserEntity> entities) {
        if (entities == null) {
            return null;
        }
        List<UserDto> list = new ArrayList<>();
        for (UserEntity userEntity : entities) {
            list.add(userEntityToDto(userEntity));
        }
        return list;
    }


    public List<UserEntity> dtoListToEntityList(List<UserDto> dtos) {
        if (dtos == null) {
            return null;
        }
        List<UserEntity> list = new ArrayList<>();
        for (UserDto userDto : dtos) {
            list.add(userDtoToEntity(userDto));
        }
        return list;
    }
}
