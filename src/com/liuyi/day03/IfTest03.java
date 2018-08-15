package com.liuyi.day03;

import java.util.Scanner;

/**
 * Created by vv on 2018/7/20.
 */
public class IfTest03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入月份：");
        int month = scanner.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("错误");
        } else if (month >= 3 && month <= 5) {
            System.out.println("春");
        } else if (month >= 6 && month <= 8) {
            System.out.println("夏");
        } else if (month >= 9 && month <= 11){
            System.out.println("秋");
        }else {
            System.out.println("冬");
        }
    }
}
