package com.cc.day01;

/**
 * Created by vv on 2018/7/9.
 */
public class ExerFor {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
            if (i % 15 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
