package com.cc.day08;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日历类
 * Created by vv on 2018/7/18.
 */
public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
      /*  calendar.set(2001, 1, 10, 12, 23, 22);
        calendar.set(Calendar.MONDAY,1);*/
        calendar.setTime(new Date());
        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println(calendar.get(calendar.YEAR));

    }
}
