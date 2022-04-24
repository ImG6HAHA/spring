package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.annotation.service.UserService;
import com.atguigu.spring5.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-24-23:43
 */
public class TestAnno {


    @Test
    public void test1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-anno.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    //纯注解开发 不用加载xml配置文件
    @Test
    public void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

}
