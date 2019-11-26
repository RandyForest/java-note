package com.randy.note.spring.anno;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Java类配置测试
 * 使用注解测试
 * 1.导入spring-test包
 * 2.使用@RunWith替换掉原有的main方法，换成Spring的
 * 3.使用@ContextConfiguration引用配置类
 *
 * Author: randy
 * Date: 2019/11/7 11:07
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Config.class)
class SpringTest {
    @Autowired
    UserService userService;

    @Test
    void test(){
        userService.say();
    }
}
