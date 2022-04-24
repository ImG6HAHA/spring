package com.atguigu.spring5.collectiontype;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-24-19:49
 */
public class Course {

    private String cname; //课程名称
    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
