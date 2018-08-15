package com.cc.day08;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vv on 2018/7/18.
 * 字符串和时间对象转化
 */
public class TestDateFormat {
    public static void main(String[] args) {
        DateFormat dateFormat;//抽象类 不能new   只能建他的子类
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy年MM月dd日");//时间格式化
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SS");//时间格式化

        Date date = new Date(1232354354436L);
        String s = dateFormat2.format(date); //将时间对象转换为字符串   将时间对象按照格式化字符串转化成字符串
        System.out.println(s);
        String s1 = "2001-1-23";
        DateFormat dateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date2 = dateFormat3.parse(s1);
            System.out.println(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
