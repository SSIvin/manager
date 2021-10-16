package smev.Service;

import smev.Dto.UserDto;
import smev.Entity.RoleView;
import smev.Entity.UserEntity;

import java.util.Set;

public interface UserService {

    UserEntity getByNameDomain(String nameDomain);

    UserDto getByName(String nameDomain);

    UserEntity getUserById(Integer userId);

    Set<RoleView> getRoleView(Integer roleId);
}
