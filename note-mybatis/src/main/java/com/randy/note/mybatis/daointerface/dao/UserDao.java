package com.randy.note.mybatis.daointerface.dao;

import com.randy.note.mybatis.daointerface.User;

/**
 * 用户数据访问对象接口
 *
 * Author: randy
 * Date: 2019/11/26 21:48
 */
public interface UserDao {
    /**
     * 根据用户ID查询用户
     *
     * @param id 用户ID
     * @return 用户对象
     */
    User query(int id);
}
