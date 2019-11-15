package com.randy.note.spring.scope;

import org.springframework.context.annotation.Bean;

/**
 * 一个简单的Bean
 *
 * Author: randy
 * Date: 2019/11/15 17:02
 */
public class MyBean {
    void Bean(){
        System.out.println("MyBean被实例。");
    }
}
