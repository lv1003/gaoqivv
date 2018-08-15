package com.liuyi.day03;

/**
 * Created by vv on 2018/7/20.
 */
public class IfTest04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 30;
     /*   //三元运算
        int temp=a>b?a:b;
        int max=temp>c?temp:c;
        System.out.println("max:"+max);*/
        int max;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
            System.out.println("max：" + max);
    }
}