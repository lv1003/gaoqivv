package com.liuyi.day04;

/**
 * Created by vv on 2018/7/22.
 */
public class ZhuMlm {
    public static void main(String[] args) {
        int count = 0;
        int end = 884800;
        int start = 1;
        while (start < end) {
            start *= 2;
            count++;
        }
        System.out.println(count+1);
    }
}
