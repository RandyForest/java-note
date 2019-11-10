package com.randy.note.ssm.model;

import java.util.List;

/**
 * Author: randy
 * Date: 2019/10/28 13:18
 */
public class Order {
    private int id;
    private String code;
    private int userId;
    private List<Product> productList;

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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", code='" + code + '\'' + ", userId=" + userId + ", productList=" + productList + '}';
    }
}
