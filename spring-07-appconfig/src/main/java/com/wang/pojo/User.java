package com.wang.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

// 这个注解的意思，就是说明这个类被spring接管了，注册到了容器中
@Controller
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("王艺博") // 属性注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
