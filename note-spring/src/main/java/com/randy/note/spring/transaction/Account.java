package com.randy.note.spring.transaction;


/**
 * Author: randy
 * Date: 2019/10/17 13:33
 */
public class Account {
    private int id;
    private double money;
    private int userId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    double getMoney() {
        return money;
    }

    void setMoney(double money) {
        this.money = money;
    }

    int getUserId() {
        return userId;
    }

    void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", money=" + money + ", userId=" + userId + '}';
    }
}
