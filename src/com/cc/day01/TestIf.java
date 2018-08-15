package com.cc.day01;

/**
 * Created by vv on 2018/7/9.
 * 测试if语句
 */
public class TestIf {
    public static void main(String[] args) {
        double d = Math.random();//返回随机小数
        int e = 1 + (int) (d * 6);//[0,4]   致筛子  1-6   1+是因为不能有0
        System.out.println("d=" + d);
        System.out.println("e=" + e);
        if (e > 3) {
            System.out.println("大数");
        } else {
            System.out.println("小数");
        }
    }
}
