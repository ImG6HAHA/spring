package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-24-19:03
 */
public class UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add.....");


//        UserDao userDao = new UserDaoImpl();
//        userDao.update();
        userDao.update();


    }




}
