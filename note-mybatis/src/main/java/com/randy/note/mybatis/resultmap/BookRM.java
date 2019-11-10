package com.randy.note.mybatis.resultmap;

/**
 * 该类的属性没有像该表一样有 b_ 前缀
 * 所以要在配置中配置结果集映射
 *
 * Author: randy
 * Date: 2019/10/23 22:46
 */
public class BookRM {
    private int id;
    private String name;
    private String price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "b_id=" + id + ", b_name='" + name + '\'' + ", b_price='" + price + '\'' + '}';
    }
}
