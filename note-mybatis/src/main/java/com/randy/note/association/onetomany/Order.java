package com.randy.note.association.onetomany;

/**
 * Author: randy
 * Date: 2019/10/28 13:18
 */
public class Order {
    private int id;
    private String code;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", code='" + code + '\'' + ", userId=" + userId + '}';
    }
}
