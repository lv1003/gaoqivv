package com.mashibin.digui;

/**
 * Created by vv on 2018/7/24.
 * 斐波那契数
 * 1，1,2,3,5,8,13，21,34
 */
public class Fab {
    public static void main(String[] args) {
        System.out.println(f(-5));
    }

    public static long f(int index) {
        if(index<1){
            System.out.println("invalid parameter!");
             //返回特殊的值
            return -1;
        }
        if (index == 1 || index == 2) {
            return 1;
        }
        //每循环一次  数字的位置发生变化
        long f1 = 1L;
        long f2 = 1L;
        long f = 0;

        for (int i = 0; i < index-2; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;

        }
        return f;
    }
}
