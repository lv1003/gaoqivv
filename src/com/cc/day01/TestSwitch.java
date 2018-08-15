package com.cc.day01;

import java.util.Map;

/**
 * Created by vv on 2018/7/9.
 * 测试switch语句
 */
public class TestSwitch {
    public static void main(String[] args) {
        double d = Math.random();
        int e = 1 + (int) (d * 6);
        System.out.println(e);
        switch (e) {//int 或者可以转为int的类型（byte、char、short）枚举   JDK7中可以放字符串
            case 6:
                System.out.println("运气好");
                break;
            case 5:
                System.out.println("运气可以");
                break;
            case 4:
                System.out.println("运气还行");
                break;
            default:
                System.out.println("运气不好！");
                break;
        }

    }
}
