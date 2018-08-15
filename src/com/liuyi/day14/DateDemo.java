package com.liuyi.day14;
import java.util.Date;
/**
 * Created by vv on 2018/8/13.
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //拿到当前的毫秒数
        // long time =System.currentTimeMillis();
        //过了一小时  Thu Jan 01 09:00:00 CST 1970    不是一点是因为中国在东八区
        long time = 1000 * 60 * 60;
        Date date1 = new Date(time);
        System.out.println(date1);

    }
}
