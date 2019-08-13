package com.randy.mysql;

import java.sql.*;

/**
 * Author: randy
 * Date: 2019/8/13 21:26
 */
public class jdbc {
    public static void main(String[] args) throws SQLException {
        // 现已自动注册，无需手动注册
        // Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_schema", "root", "root");

        printInfo(connection);

        // 从连接中获取语句对象
        Statement statement = connection.createStatement();

        // 执行查询语句并返回结果集
        ResultSet resultSet = statement.executeQuery("select * from user");

        // 遍历结果集
        while (resultSet.next()) {
            // 获取字段id与name
            System.out.println("id: "+resultSet.getString("id")+", name: "+resultSet.getString("name"));
        }

        resultSet.close();
        statement.close();
        connection.close();
    }

    private static void printInfo(Connection connection) throws SQLException {
        System.out.println("连接是否关闭："+connection.isClosed());
    }
}
