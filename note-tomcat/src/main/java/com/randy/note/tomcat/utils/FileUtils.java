package com.randy.note.tomcat.utils;

import java.io.File;

/**
 * Author: randy
 * Date: 2019/8/27 21:28
 */
public class FileUtils {
     static String DEV_DIR_RELATIVELY = "/target/classes";
    static String PRODUCT_DIR_RELATIVELY = "/";

    public static void printFiles(String path){
        File file = new File(path);
        System.out.println(file.getAbsoluteFile());

        String[] list = file.list();
        assert list != null;
        for (String i : list) {
            System.out.println(i);
        }
    }
}
