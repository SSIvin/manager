package smev.converters;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import smev.Dto.RoleDto;
import smev.Dto.RoleViewDto;
import smev.Entity.RoleEntity;
import smev.Entity.RoleView;

import java.util.Set;

@Mapper
public interface RoleConverter {
    public static final RoleConverter MAPPER = (RoleConverter) Mappers.getMapper(RoleConverter.class);

    Set<RoleDto> userEntityToDto(Set<RoleEntity> paramRoleEntity);

    Set<RoleEntity> userDtoToEntity(Set<RoleDto> paramRoleDto);

    Set<RoleViewDto> RoleViewEntityToDto(Set<RoleView> paramRoleView);
}


