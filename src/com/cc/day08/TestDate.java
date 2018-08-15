package com.cc.day08;

import java.util.Date;

/**
 * Created by vv on 2018/7/18.
 * 测试时间类的用法
 */
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        long t = System.currentTimeMillis();//代表当前时间
        System.out.println(t);
        Date date1=new Date(1000);
        System.out.println(date1.toGMTString());//过时了 不建议使用
        date1.setTime(123213);


    }
}
