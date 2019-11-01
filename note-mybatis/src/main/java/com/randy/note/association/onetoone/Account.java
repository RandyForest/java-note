package com.randy.note.association.onetoone;

/**
 * Author: randy
 * Date: 2019/10/26 17:12
 */
public class Account {
    private int id;
    private double money;
    private int userId;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", money=" + money + ", user_id=" + userId + ", user=" + user + '}';
    }
}
