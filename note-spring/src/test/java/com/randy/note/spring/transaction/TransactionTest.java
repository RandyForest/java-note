package com.randy.note.spring.transaction;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Author: randy
 * Date: 2019/10/18 20:15
 */
class TransactionTest {
    @Test
    void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml","./transaction.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

        Account account = new Account();
        account.setMoney(100.99);
        account.setUserId(2);

        int add = accountDao.add(account);
        System.out.println("添加账户操作，改动 "+add+" 行");
    }

    @Test
    void testDelete(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml","./transaction.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

        int delete = accountDao.delete(3);
        System.out.println("删除账户操作，改动 "+delete+" 行");
    }

    @Test
    void testQuery(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml","./transaction.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

        Account account = accountDao.query(2);
        System.out.println(account);
    }

    @Test
    void testQueryAll(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml","./transaction.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

        List<Account> accounts = accountDao.queryAll();
        System.out.println(accounts);
    }

    @Test
    void testTransfer(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml","./transaction.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

        boolean transfer = accountDao.transfer(10, 1, 2);
        System.out.println(transfer);
    }
}
