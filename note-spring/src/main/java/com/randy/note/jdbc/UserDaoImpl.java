package com.randy.note.jdbc;

import org.springframework.jdbc.core.*;

import java.util.List;

/**
 * Author: randy
 * Date: 2019/10/17 13:39
 */
public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    /**
     * Spring中配置
     *
     * @param jdbcTemplate JDBC模板
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * 添加操作
     *
     * @param user 用户对象
     * @return 影响的行数
     */
    @Override
    public int add(User user) {
        String sql = "insert into user(id,name,password,birthday,sex,address) value(?,?,?,?,?,?)";
        Object[] objArray = new Object[]{user.getId(), user.getName(), user.getPassword(), user.getBirthday(), user.getSex(), user.getAddress()};
        return this.jdbcTemplate.update(sql, objArray);
    }

    /**
     * 删除操作
     *
     * @param id 用户ID
     * @return 影响的行数
     */
    @Override
    public int delete(int id) {
        String sql = "delete from user where id=?";
        return this.jdbcTemplate.update(sql, id);
    }

    /**
     * 更新操作
     *
     * @param user 用户对象
     * @return 影响的行数
     */
    @Override
    public int update(User user) {
        String sql = "update user set name=?,password=?,birthday=?,sex=?,address=? where id=?";
        Object[] objArray = new Object[]{user.getName(), user.getPassword(), user.getBirthday(), user.getSex(), user.getAddress(), user.getId()};
        return this.jdbcTemplate.update(sql, objArray);
    }

    /**
     * 验证用户
     *
     * @param name     用户名
     * @param password 密码
     * @return 用户对象
     */
    @Override
    public User check(String name, String password) {
        // 此语句会存在漏洞
        // String sql = "select * from user where name='" + name + "' and password='" + password + "'";
        String sql = "select * from user where name=? and password=?";

        // User user = new User();
        // this.jdbcTemplate.query(sql, (rch) -> {
        //     user.setId(rch.getInt("id"));
        //     user.setName(rch.getString("name"));
        //     user.setPassword(rch.getString("password"));
        //     user.setBirthday(rch.getDate("birthday"));
        //     user.setSex(rch.getString("sex"));
        //     user.setAddress(rch.getString("address"));
        // }, name, password);

        RowMapper<User> userRowMapper = new BeanPropertyRowMapper<>(User.class);
        ResultSetExtractor<List<User>> userRowMapperResultSetExtractor = new RowMapperResultSetExtractor<>(userRowMapper);
        List<User> users = this.jdbcTemplate.query(sql, userRowMapperResultSetExtractor, name, password);

        User user = null;
        if (users != null && !users.isEmpty()) {
            user = users.get(0);
        }

        return user;
    }

    /**
     * 查询用户
     *
     * @param id 用户ID
     * @return 用户对象
     */
    @Override
    public User query(int id) {
        String sql = "select * from user where id=?";
        RowMapper<User> userRowMapper = new BeanPropertyRowMapper<>(User.class);
        ResultSetExtractor<List<User>> userRowMapperResultSetExtractor = new RowMapperResultSetExtractor<>(userRowMapper);
        List<User> users = this.jdbcTemplate.query(sql, userRowMapperResultSetExtractor, id);

        User user = null;
        if (users != null && !users.isEmpty()) {
            user = users.get(0);
        }

        return user;
    }

    /**
     * 查询全部用户
     *
     * @return 所有用户对象列表
     */
    @Override
    public List<User> queryAll() {
        String sql = "select * from user";
        RowMapper<User> userRowMapper = new BeanPropertyRowMapper<>(User.class);
        ResultSetExtractor<List<User>> userRowMapperResultSetExtractor = new RowMapperResultSetExtractor<>(userRowMapper);
        List<User> users = this.jdbcTemplate.query(sql, userRowMapperResultSetExtractor);

        return users;
    }
}
