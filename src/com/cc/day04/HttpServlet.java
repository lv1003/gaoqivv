package com.cc.day04;

/**
 * Created by vv on 2018/7/12.
 */
public class HttpServlet {
    public void service(){
        System.out.println("HttpServlet.service()");
        doGet();//不调用父类的doGet()
    }


    public void doGet() {
        System.out.println("HttpServlet.doGet");

    }


    public void doPost() {
        System.out.println("HttpServlet.doPost");


    }
}
