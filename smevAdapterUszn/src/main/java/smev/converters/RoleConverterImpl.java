package smev.converters;

import smev.Dto.RoleDto;
import smev.Dto.RoleViewDto;
import smev.Entity.RoleEntity;
import smev.Entity.RoleView;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RoleConverterImpl
        implements RoleConverter {
    public Set<RoleDto> userEntityToDto(Set<RoleEntity> entity) {
        if (entity == null) {
            return null;
        }

        Set<RoleDto> ListroleDto = new HashSet<>();
        for (RoleEntity roleEntity:entity) {
            ListroleDto.add(new RoleDto(roleEntity.getId(), roleEntity.getName(), roleEntity.getDescription()));
        }
        return ListroleDto;






//        RoleDto roleDto = new RoleDto();
//        roleDto.setId(entity.getId());
//        roleDto.setName(entity.getName());
//        roleDto.setDescription(entity.getDescription());
//        roleDto.add()
//        return roleDto;
    }


    public Set<RoleEntity> userDtoToEntity(Set<RoleDto> dto) {
        if (dto == null) {
            return null;
        }
//        RoleEntity roleEntity = new RoleEntity();
//        roleEntity.setId(dto.getId());
//        roleEntity.setName(dto.getName());
//        roleEntity.setDescription(dto.getDescription());
        return null;
    }

    @Override
    public Set<RoleViewDto> RoleViewEntityToDto(Set<RoleView> paramRoleView) {
        if (paramRoleView == null) {
            return null;
        }

        Set<RoleViewDto> roleViewDto = new HashSet<>();
        for (RoleView roleView: paramRoleView) {
            roleViewDto.add(new RoleViewDto(roleView.getInteractionDirection(),roleView.getInteractionType()));
        }
        return roleViewDto;
    }
}
