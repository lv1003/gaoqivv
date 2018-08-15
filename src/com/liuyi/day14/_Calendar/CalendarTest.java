package com.liuyi.day14._Calendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by vv on 2018/8/14.
 * 二月有几天
 */
public class CalendarTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年份");
        int year = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,2,1);
        calendar.add(Calendar.DATE,-1);
        System.out.println(calendar.get(Calendar.DATE));
    }
}
