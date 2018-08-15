package com.cc.day01;

/**
 * Created by vv on 2018/7/9.
 */
public class TestSwitch2 {
    public static void main(String[] args) {
        String a = "lvwei";

        switch (a) {
            case "menmen":
                System.out.println("menmen");
                break;
            case "lili":
                System.out.println("lili");
                break;
            default:
                System.out.println("对的是：lvwei");
                break;
        }
    }
}
