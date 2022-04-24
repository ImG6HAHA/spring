package com.atguigu.spring5;

/**
 * AUTHOR: Z
 * CREATE TIME:2022-04-24-0:01
 */
public class Book {
    //创建属性
    private String bname;
    private String bauthor;
    private String address;
    //创建属性对应的 set 方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public Book(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //    public void setBauthor(String bauthor) {
//        this.bauthor = bauthor;
//    }


    public void testDemo(){
        System.out.println(bname + " " + bauthor+ " "+address);
    }

}
