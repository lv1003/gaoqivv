package com.liuyi.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by vv on 2018/8/13.
 */
public class DateUti {
    public static void main(String[] args) throws ParseException {
        String s = "1945-10-3";
        System.out.println(getLife(s));

    }

    public static long getLife(String s) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sf.parse(s);
        long time = date.getTime();
        long inTime = System.currentTimeMillis();
        long tian = (inTime - time) / 1000 / 60 / 60 / 24;
        return tian;

    }

}
