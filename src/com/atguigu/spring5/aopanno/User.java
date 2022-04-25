package com.atguigu.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-25-18:33
 */
@Component
//被增强的类
public class User {

    public void add() {
//        int i=10/0;//模拟异常
        System.out.println("add.......");
    }

}
