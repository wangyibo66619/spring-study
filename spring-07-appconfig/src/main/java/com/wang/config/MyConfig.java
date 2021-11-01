package com.wang.config;

import com.wang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

// 这个也会被spring容器托管，注册到容器中，因为它本身就是一个@Component
// @Configuration代表一个配置类，和我们之前的beans.xml一样
@Configuration
@ComponentScan("com.wang.pojo")  // 扫描包
@Import(MyConfig2.class)
public class MyConfig {

    // 注册一个bean，相当于一个bean标签
    // 这个方法的名字，就相当于bean标签中的id属性
    // 这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User(); // 就是返回要注入到bean的对象
    }
}
