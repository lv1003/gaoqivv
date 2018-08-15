package com.liuyi.day12.com.cc.one;

import java.util.Scanner;

/**
 * Created by vv on 2018/8/5.
 */
public class ScannerDemo {
    public static void main(String[] args) {
        //System.in 静态变量   是InputStream的一个对象  标准的输入流 ，对应键盘录入
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("x=" + x);
    }
}
