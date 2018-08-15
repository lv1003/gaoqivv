package com.cc.day04;

/**
 * Created by vv on 2018/7/12.
 */
public class Test {
    public static void main(String[] args) {
        //父类的引用指向子类的对象
        HttpServlet httpServlet = new MyServlet();
        //调用父类的方法    doGet（）; 调用的子类的
        httpServlet.service();
    }
}
