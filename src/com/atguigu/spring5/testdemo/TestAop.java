package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.aopanno.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-25-18:45
 */
public class TestAop {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanAOP.xml");
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }



}
