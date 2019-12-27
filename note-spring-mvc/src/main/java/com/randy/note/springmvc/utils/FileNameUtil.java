package com.randy.note.springmvc.utils;

import java.util.Arrays;

/**
 * Author: randy
 * Date: 2019/12/25 23:10
 */
public class FileNameUtil {
    public static String addTimestamp(String fileName) {
        String[] strings = fileName.split("\\.");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (i < strings.length - 1)
                stringBuilder.append(strings[i]).append(".");
            else {
                stringBuilder.append(System.currentTimeMillis()).append(".").append(strings[i]);
            }
        }
        return String.valueOf(stringBuilder);
    }
}
