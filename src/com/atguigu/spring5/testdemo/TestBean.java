package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.User;
import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-24-19:15
 */
public class TestBean {

    @Test
    public void testBean2(){
        //1 加载 spring 配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        //2 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }


    @Test
    public void testBean3(){
        //1 加载 spring 配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        //2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.add();
    }

}
