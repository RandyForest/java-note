package com.randy.note.base.notetry;

import org.junit.jupiter.api.Test;

/**
 * Author: randy
 * Date: 2019/10/22 14:45
 */
class MOteTryTest {
    @Test
    void test(){
        NoteTry noteTry = new NoteTry();
        int i = noteTry.tryInt();
        System.out.println(i);
    }

    @Test
    void testTryString(){
        NoteTry noteTry = new NoteTry();
        String s = noteTry.tryString();
        System.out.println(s);
    }

    @Test
    void testTraySimpleClass(){
        NoteTry noteTry = new NoteTry();
        SimpleClass simpleClass = noteTry.trySimpleClass();
        System.out.println(simpleClass.getNum());
    }
}
