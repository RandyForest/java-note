package com.randy.note.javaconfig2.config;

import com.randy.note.javaconfig2.dao.UserDao;
import com.randy.note.javaconfig2.dao.impl.UserDaoNormal;
import com.randy.note.javaconfig2.service.UserService;
import com.randy.note.javaconfig2.service.impl.UserServiceNormal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 所有关系在此类配置
 *
 * Date: 2019/11/8 0:02
 *
 * @author randy
 */
@Configuration
public class Config {

    /**
     * 被 @Bean 注解的方法会自动调用，并交给Spring管理
     *
     * @return 用户数据访问对象
     */
    @Bean
    UserDao userDaoNormal() {
        System.out.println("Config.userDaoNormal()");
        return new UserDaoNormal();
    }

    /**
     * 在之前创建了UserDao的对象后，可以直接用形参接收
     *
     * @return 用户服务对象
     */
    @Bean
    UserService userServiceNormal(UserDao userDao) {
        System.out.println("Config.userServiceNormal()");
        UserServiceNormal userService = new UserServiceNormal();
        userService.setUserDao(userDao);
        return userService;
    }
}
