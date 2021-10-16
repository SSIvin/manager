package smev.Service.Impl;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smev.Dto.UserDto;
import smev.Entity.RoleEntity;
import smev.Entity.RoleView;
import smev.Entity.UserEntity;
import smev.Service.UserService;
import smev.converters.UserConverter;
import smev.dao.SmevDao;
import smev.exceptions.ModelException;

import java.util.Set;

@Service
@Log4j2
public class UserServiceImpl implements UserService {


    @Autowired
    private SmevDao smevDao;

    @Override
    public UserEntity getByNameDomain(String nameDomain) {
        UserEntity userEntity = this.smevDao.getByNameDomain(nameDomain);
        if (userEntity == null) {
            throw new ModelException("user with userName: \"" + nameDomain + "\" not found");
        }
        userEntity.setRoles(this.smevDao.getByRoles(userEntity.getId()));
        userEntity.setRoleView(this.smevDao.getRolesView(userEntity.getId()));

        return userEntity;
    }

    @Override
    public UserDto getByName(String nameDomain) {
        return UserConverter.MAPPER.userEntityToDto(this.getByNameDomain(nameDomain));
    }

    @Override
    public UserEntity getUserById(Integer userId) {
        return this.smevDao.getUserById(userId);
    }

    @Override
    public Set<RoleView> getRoleView(Integer user_id) {
        return this.smevDao.getRolesView(user_id);
    }

}
