package com.randy.note.spring.example.dao.impl;

import com.randy.note.spring.example.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * 数据访问类
 *
 * 使用 @Repository 代替 @Component
 * Author: randy
 * Date: 2019/11/7 17:43
 */
// @Component
@Repository
public class UserDaoNormal implements UserDao {
    @Override
    public void add() {
        System.out.println("插入用户到数据库");
    }
}
