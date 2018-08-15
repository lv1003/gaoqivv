package com.cc.day10;

/**
 * Created by vv on 2018/7/19.
 */
public class TestException {
    public static void main(String[] args) {
        int i=1/0;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
