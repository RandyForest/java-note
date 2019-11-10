package com.randy.note.base.mysql;

import java.sql.*;

/**
 * Author: randy
 * Date: 2019/8/13 21:26
 */
public class jdbc {
    private static final String DB_NAME = "test_schema";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String QUERY_STATEMENT = "select * from user";
    private static final String ID = "id";
    private static final String NAME = "name";

    public static void main(String[] args) throws SQLException {
        // 现已自动注册，无需手动注册
        // Class.forName("com.mysql.jdbc.Driver");

        // 获取连接对象
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        printInfo(connection);
        query(connection);

        connection.close();
    }

    private static void query(Connection connection) throws SQLException {
        // 从连接中获取语句对象
        Statement statement = connection.createStatement();

        // 执行查询语句并返回结果集
        ResultSet resultSet = statement.executeQuery(QUERY_STATEMENT);

        // 遍历结果集
        while (resultSet.next()) {
            // 获取字段id与name
            System.out.println(ID +": "+ resultSet.getString(ID) + ", " + NAME + ": " + resultSet.getString(NAME));
        }

        resultSet.close();
        statement.close();
    }

    private static void printInfo(Connection connection) throws SQLException {
        System.out.println("连接是否关闭：" + connection.isClosed());
    }
}
