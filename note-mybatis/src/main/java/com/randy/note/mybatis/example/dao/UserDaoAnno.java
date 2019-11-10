package com.randy.note.mybatis.example.dao;

import com.randy.note.mybatis.example.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Author: randy
 * Date: 2019/8/1 21:44
 */
public interface UserDaoAnno {
    /**
     * 使用注解配置SQL语句
     * 无需在UserDao.xml中配置
     * @return 返回User对象列表
     */
    @Select("select * from user")
    List<User> findAll();
}
