package com.liuyi.day14.iccase;

import com.liuyi.day14.DateUti;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by vv on 2018/8/14.
 * 工具类测试
 */
public class DateUtilDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        String time= DateUtil.dateToString(date,"HH:mm:ss");
        System.out.println(time);
        String time2= DateUtil.dateToString(date,"yyyy-MM-dd");
        System.out.println(time2);

        String times="2018-10-03";
        Date date1=DateUtil.stringToDate(times,"yyyy-MM-dd");
        System.out.println(date1);
    }
}
