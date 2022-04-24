package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.User;
import com.atguigu.spring5.autowire.Emp;
import com.atguigu.spring5.bean.Orders;
import com.atguigu.spring5.collectiontype.Book;
import com.atguigu.spring5.collectiontype.Course;
import com.atguigu.spring5.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-24-19:55
 */
public class TestCollection {


    @Test
    public void test1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }


    //测试list提取
    @Test
    public void test2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean5.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
//        book.test();
        System.out.println(book1);//bean默认单实例   bean配置文件里：scope="prototype"设置为多实例
        System.out.println(book2);

    }


    //测试工厂bean
    @Test
    public void test3(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean6.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    //测试bean生命周期
    @Test
    public void test4(){
        //        ApplicationContext context =
//                new ClassPathXmlApplicationContext("bean7.xml");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);

        //手动让bean实例销毁
        context.close();
    }


    //自动装配
    @Test
    public void test5() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean8.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }






}
