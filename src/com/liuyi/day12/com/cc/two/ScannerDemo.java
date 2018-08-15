package com.liuyi.day12.com.cc.two;

import java.util.Scanner;

/**
 * Created by vv on 2018/8/6.
 * .InputMismatchException
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //判断是不是int值
        if(sc.hasNextInt()){
        int a=sc.nextInt();
        }else {
            System.out.println("您输入的数据类型不匹配！");
        }


    }
}
