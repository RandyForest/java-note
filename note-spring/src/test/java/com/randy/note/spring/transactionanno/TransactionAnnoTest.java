package com.randy.note.spring.transactionanno;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: randy
 * Date: 2019/10/18 23:15
 */
class TransactionAnnoTest {
    @Test
    void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./jdbc.xml","./transaction-annotation.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDaoAnno");

        boolean transfer = accountDao.transfer(10, 2, 1);
        System.out.println(transfer);

    }
}
