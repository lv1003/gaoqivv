package com.cc.day09;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by vv on 2018/7/19.
 * 可视化日历程序
 */
public class VisualCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String temp = inputString;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(temp);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            int day = calendar.get(Calendar.DATE);
            calendar.set(Calendar.DATE, 1);
            System.out.println();
            int maxData = calendar.getActualMaximum(Calendar.DATE);
            System.out.println("日\t一\t二\t三\t四\t五\t六\t");
            for (int i = 0; i < calendar.get(Calendar.DAY_OF_WEEK) - 1; i++) {
                System.out.print("\t");
            }

            for (int i = 1; i <= maxData; i++) {
                if (i == day) {
                    System.out.print("*");
                }
                System.out.print(i + "\t");
                int w = calendar.get(Calendar.DAY_OF_WEEK);
                if (w == Calendar.SATURDAY) {
                    System.out.println();
                }
                calendar.add(Calendar.DATE, 1);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
