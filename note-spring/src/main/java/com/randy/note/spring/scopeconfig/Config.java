package com.randy.note.spring.scopeconfig;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 配置类
 *
 * Author: randy
 * Date: 2019/11/15 17:31
 */
@Configuration
public class Config {
    /**
     * 配置单例作用域的Bean
     * @return 单例Bean
     */
    @Bean
    MyBeanSingleton myBeanSingletonScope(){
        return new MyBeanSingleton();
    }

    /**
     * 配置原型作用域的Bean
     * @return 原型Bean
     */
    @Bean
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    MyBeanPrototype myBeanPrototypeScope(){
        return new MyBeanPrototype();
    }
}
