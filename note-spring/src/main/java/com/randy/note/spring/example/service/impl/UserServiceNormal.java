package com.randy.note.spring.example.service.impl;

import com.randy.note.spring.example.dao.UserDao;
import com.randy.note.spring.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 服务类
 *
 * 使用 @Service 代替 @Component
 * Author: randy
 * Date: 2019/11/7 17:45
 */
// @Component
@Service
public class UserServiceNormal implements UserService {
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        userDao.add();
    }
}
