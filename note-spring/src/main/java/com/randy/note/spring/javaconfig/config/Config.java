package com.randy.note.spring.javaconfig.config;

import com.randy.note.spring.javaconfig.service.UserService;
import com.randy.note.spring.javaconfig.service.impl.UserServiceNormal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Date: 2019/11/8 0:02
 *
 * @author randy
 */
@Configuration
public class Config {
    /**
     * 被 @Bean 注解的方法会自动调用，并交给Spring管理
     *
     * @return 用户服务对象
     */
    @Bean
    UserService userServiceNormal(){
        System.out.println("Config.userServiceNormal()");
        return new UserServiceNormal();
    }
}
