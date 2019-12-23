package com.randy.note.springmvc.model;

import java.util.Date;

/**
 * Author: randy
 * Date: 2019/12/20 0:12
 */
public class User {
    private String username;

    private Date date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" + "username='" + username + '\'' + ", date=" + date + '}';
    }
}
