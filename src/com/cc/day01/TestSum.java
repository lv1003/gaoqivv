package com.cc.day01;

/**
 * Created by vv on 2018/7/9.
 */
public class TestSum {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("sum="+sum);
    }
}
