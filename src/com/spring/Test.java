package com.spring;

import com.spring.config.AppConfig;
import com.spring.context.MyApplicationContext;
import com.spring.service.UserService;

public class Test {

    public static void main(String[] args) {
        MyApplicationContext applicationContext = new MyApplicationContext(AppConfig.class);
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        System.out.println(userService);
    }

}
