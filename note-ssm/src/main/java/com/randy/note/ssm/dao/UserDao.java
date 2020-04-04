package com.randy.note.ssm.dao;

import com.randy.note.ssm.model.User;

/**
 * Author: randy
 * Date: 2019/12/9 23:19
 */
public interface UserDao {
    /**
     * 查询用户
     *
     * @param id 用户ID
     * @return 用户
     */
    User query(int id);
}
