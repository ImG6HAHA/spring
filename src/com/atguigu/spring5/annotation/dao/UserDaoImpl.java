package com.atguigu.spring5.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-24-23:54
 */

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("dao add.....");
    }
}
