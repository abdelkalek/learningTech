package com.ms.student.Services;

import com.ms.common.Interfaces.IGeneriqueService;
import com.ms.student.entites.User;

import java.util.List;

/**
 * @author Abdelkhalek Guedri
 * @since 20/06/2023
 */
public class UserService implements IGeneriqueService<User> {

    public User findUserByUsername(String username) {
        User user = securityDao.findUserByUsername();
        if(user == null) throw new UserNotFoundException("User not found :" +  -
                username);
        return user;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void create(User object) {

    }

    @Override
    public void update(User object) {

    }

    @Override
    public void delete(Long id) {

    }
}
