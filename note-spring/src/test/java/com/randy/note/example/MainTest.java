package com.randy.note.example;

import com.randy.note.example.config.Config;
import com.randy.note.example.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: randy
 * Date: 2019/11/7 17:56
 */
@SpringJUnitConfig(Config.class)
public class MainTest {
    @Autowired
    private UserController userController;

    @Test
    void test(){
        userController.add();
    }
}
