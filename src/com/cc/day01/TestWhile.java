package com.cc.day01;

/**
 * Created by vv on 2018/7/9.
 */
public class TestWhile {
    public static void main(String[] args) {
        int a = 1;//初始化
        while (a <= 100) {//条件判断
            System.out.println(a);//循环体
            a += 1;//迭代
        }
        System.out.println("跳出循环！");
    }
}
