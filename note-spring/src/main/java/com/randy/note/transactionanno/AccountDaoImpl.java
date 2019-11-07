package com.randy.note.transactionanno;

import org.springframework.jdbc.core.*;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author: randy
 * Date: 2019/10/17 13:39
 */
public class AccountDaoImpl implements AccountDao {
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
     * @param account 用户对象
     * @return 影响的行数
     */
    @Override
    public int add(Account account) {
        String sql = "insert into account(id,money,user_id) value(?,?,?)";
        Object[] objArray = new Object[]{account.getId(), account.getMoney(), account.getUserId()};
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
        String sql = "delete from account where id=?";
        return this.jdbcTemplate.update(sql, id);
    }

    /**
     * 查询用户
     *
     * @param id 用户ID
     * @return 用户对象
     */
    @Override
    public Account query(int id) {
        String sql = "select * from account where id=?";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<>(Account.class);
        ResultSetExtractor<List<Account>> resultSetExtractor = new RowMapperResultSetExtractor<>(rowMapper);
        List<Account> accounts = this.jdbcTemplate.query(sql, resultSetExtractor, id);

        Account account = null;
        if (accounts != null && !accounts.isEmpty()) {
            account = accounts.get(0);
        }

        return account;
    }

    /**
     * 查询全部用户
     *
     * @return 所有用户对象列表
     */
    @Override
    public List<Account> queryAll() {
        String sql = "select * from account";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<>(Account.class);
        ResultSetExtractor<List<Account>> resultSetExtractor = new RowMapperResultSetExtractor<>(rowMapper);
        List<Account> accounts = this.jdbcTemplate.query(sql, resultSetExtractor);

        return accounts;
    }

    /**
     * @param money   金额
     * @param outUser 转款人ID
     * @param inUser  收款人ID
     * @return 是否成功
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    public boolean transfer(double money, int outUser, int inUser) {
        String minusFromOutUser = "update account set money=money-? where id=?";
        int minus = this.jdbcTemplate.update(minusFromOutUser, money, outUser);

        // 模拟异常
        // int i=1/0;

        String addToInUser = "update account set money=money+? where id=?";
        int add = this.jdbcTemplate.update(addToInUser, money, inUser);

        return minus > 0 && add > 0;
    }
}
