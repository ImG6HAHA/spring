package com.atguigu.spring5.bean;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-24-19:23
 */
//部门类
public class Dept {

    private String dName;

    public void setdName(String dName) {
        this.dName = dName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dName='" + dName + '\'' +
                '}';
    }
}
