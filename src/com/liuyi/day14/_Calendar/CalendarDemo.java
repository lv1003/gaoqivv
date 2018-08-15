package com.liuyi.day14._Calendar;

import java.util.Calendar;

/**
 * Created by vv on 2018/8/14.
 *
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar rightNow=Calendar.getInstance();
        int year=rightNow.get(Calendar.YEAR);
        int month=rightNow.get(Calendar.MONTH);
        int day=rightNow.get(Calendar.DATE);
        System.out.println(year+"年"+(month+1)+"月"+day+"日");
    }
}
