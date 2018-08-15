package com.cc.day02;

import java.util.Scanner;

/**
 * Created by vv on 2018/7/10.
 * 测试Scanner累的使用，如何接受键盘的输入
 * new Scanner()构造器
 * System.in 接受键盘的输入
 *
 * @author lvwei
 */
public class TestScanner {
    public static void main(String[] args) {
        test();
        test1();
    }

    public static void test() {
        Scanner scanner = new Scanner(System.in);
        int shuZi = scanner.nextInt();//程序运行到nextInt（） 会堵塞，等待键盘的输入
        String string = scanner.next();
        System.out.println(shuZi);
        System.out.println(string);
    }

    public static void test1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入加数");
        int a = scanner.nextInt();
        System.out.println("输入被加数");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("计算结果" + sum);

    }
}
