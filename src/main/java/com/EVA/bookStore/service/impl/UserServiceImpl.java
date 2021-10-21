package com.EVA.bookStore.service.impl;

import com.EVA.bookStore.dao.UserDao;
import com.EVA.bookStore.dao.impl.UserDaoImpl;
import com.EVA.bookStore.pojo.User;
import com.EVA.bookStore.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();
    @Override
    public void registerUser(User user) {
            userDao.saveUser(user);
    }

    @Override
    public User login(User user) {

        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        if (null== userDao.queryUserByUsername(username)) return false;
        return true;
    }
}
