package com.randy.mysql;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Author: randy
 * Date: 2019/8/14 21:13
 */
public class dbcp {
    public static void main(String[] args) throws NamingException, SQLException {
        System.setProperty(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.fscontext.RefFSContextFactory");
        System.setProperty(Context.PROVIDER_URL, "file:///tmp");
        InitialContext ic = new InitialContext();

        // Construct BasicDataSource
        BasicDataSource bds = new BasicDataSource();
        bds.setDriverClassName("org.apache.commons.dbcp2.TesterDriver");
        bds.setUrl("jdbc:apache:commons:testdriver");
        bds.setUsername("userName");
        bds.setPassword("password");

        ic.rebind("jdbc/basic", bds);

        // Use
        InitialContext ic2 = new InitialContext();
        DataSource ds = (DataSource) ic2.lookup("jdbc/basic");
        // assertNotNull(ds);
        Connection conn = ds.getConnection();
        // assertNotNull(conn);
        conn.close();
    }
}
