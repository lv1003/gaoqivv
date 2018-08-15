package com.liuyi.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vv on 2018/8/13.
 * Date --->String
 * String--->Date
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sf.format(date);
        System.out.println(time);

        String ti = "1992-10-03 13:22:23";
        SimpleDateFormat sfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1= null;
        try {
            date1 = sfs.parse(ti);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date1);
    }

}
