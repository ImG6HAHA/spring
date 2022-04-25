package com.atguigu.spring5.jdk;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-25-15:12
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了.....");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了.....");
        return id;
    }
}
