package com.randy.note.spring.jdbctemplate;

import com.randy.note.spring.jdbc.User;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;
import java.util.Map;

/**
 * Author: randy
 * Date: 2019/11/21 14:56
 */
public class JdbcTemplateNote {
    public static void main(String[] args) {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        // driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/test");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(driverManagerDataSource);
        jdbcTemplate.query("select * from user where id=1", rs -> {
            System.out.println("id: "+rs.getInt("id"));
            System.out.println("name: "+rs.getString("name"));
            System.out.println("password: "+rs.getString("password"));
        });

        List<Map<String, Object>> userList = jdbcTemplate.queryForList("select * from user");
        System.out.println(userList);

        ResultSetExtractor<List<User>> resultSetExtractor = new RowMapperResultSetExtractor<>(new BeanPropertyRowMapper<>(User.class));
        List<User> userList1 = jdbcTemplate.query("select * from user where id=1",resultSetExtractor);
        System.out.println(userList1);

    }
}
