package com.randy.note.base.modifier.finalmodifier;

/**
 * Author: randy
 * Date: 2019/11/17 14:33
 */
public class FinalNote {
   final int i=1;
   final StringBuilder sb = new StringBuilder("sb");

    public static void main(String[] args) {
        // 无法赋值，报错
        // i=2;

        // 无法赋值，报错
        // sb = new StringBuilder("bs");

        // sb.append("bbb");
    }
}
