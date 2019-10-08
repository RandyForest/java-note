package com.randy.tomcat.lisenter;

import com.randy.tomcat.utils.FileUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Author: randy
 * Date: 2019/8/27 21:37
 */
public class FileListener implements ServletContextListener {
    static String DEV_DIR_RELATIVELY = "/target/classes";
    static String PRODUCT_DIR_RELATIVELY = "/";


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("FileListener#contextInitialized()");

        ServletContext servletContext = sce.getServletContext();
        System.out.println(servletContext.getContextPath());
        System.out.println(servletContext.getRealPath("./"));

        FileUtils.printFiles(servletContext.getRealPath("./"));
        servletContext.setInitParameter("devDir", "");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("FileListener#contextDestroyed()");
    }
}
