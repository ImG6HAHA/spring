package com.atguigu.spring5.annotation.service;

import com.atguigu.spring5.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-24-23:42
 */

@Service
public class UserService {

    @Value(value = "abc")//注入普通类型属性值
    private String name;


//    @Autowired//根据类型注入
//    @Qualifier(value = "userDaoImpl1")//根据名称注入 要和@Autowired配合使用
    @Resource(name = "userDaoImpl1")//可以根据类型和名称注入
    private UserDao userDao;

    public void add(){
        System.out.println("service add....."+name);
        userDao.add();
    }

}
