package com.cc.day01;

/**
 * Created by vv on 2018/7/9.
 * 1=1
 * 1*2=2
 * 1*2*3=6
 * 1*2*3*4=24
 */
public class JieChen {
    public static void main(String[] args) {
        System.out.println(JieC(4));

    }

    public static int JieC(int c) {
        int sum = 0;
        for (int i=1;i<=c;i++){
            int a=1;
            for (int j=1;j<=i;j++){
                a=a*j;
            }
            sum+=a;
        }
        return sum;

    }
}