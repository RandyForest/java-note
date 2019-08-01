package com.randy.file;

import java.io.File;

public class MyFileFilter {
    public MyFileFilter() {
    }

    public static void main(String[] args) {
        File file = new File("D:\\randy\\Desktop\\NewFolder");
        MyFilter myFilter = new MyFilter();
        String[] arrStr = file.list(myFilter);
        String[] var4 = arrStr;
        int var5 = arrStr.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            String i = var4[var6];
            System.out.println(i);
        }

    }
}
