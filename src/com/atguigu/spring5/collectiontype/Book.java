package com.atguigu.spring5.collectiontype;

import java.util.List;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-24-19:50
 */
public class Book {

    private List<String> list;
    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println(list);
    }


}
