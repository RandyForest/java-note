package com.randy.note.base.jse;

/**
 * Author: randy
 * Date: 2019/10/21 19:32
 */
public class NoteString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 ="abc";
        String s3 ="a"+"b"+"c";
        String s4 = new String("abc");

        /*
         * == 比较的是 HashCode
         */
        System.out.println(s1==s2); // true
        System.out.println(s1==s3); // true
        System.out.println(s1==s4); // false

        /*
         * String的equals()方法被重写，不再比较HashCode
         * 而是比较字符串内容
         */
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // true

        String s5 = new String("abc");
        System.out.println(s4==s5); // false
        System.out.println(s4.equals(s5)); // true

    }
}
