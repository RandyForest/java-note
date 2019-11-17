package com.randy.note.base.file.properties;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * 读取配置文件工具类
 * 1.只能读 .properties
 * 2.只能读不能写
 * 3.只能读取类路径下的文件
 *
 * Author: randy
 * Date: 2019/11/17 14:49
 */
public class ResourceBundleNote {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.randy.note.base.file.properties.test");
        Enumeration<String> keys = resourceBundle.getKeys();
        keys.asIterator().forEachRemaining(key -> System.out.println("Key: " + key + ", Value: " + resourceBundle.getString(key)));
    }
}
