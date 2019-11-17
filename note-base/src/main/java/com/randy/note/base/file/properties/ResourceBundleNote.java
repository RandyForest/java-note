package com.randy.note.base.file.properties;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
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
