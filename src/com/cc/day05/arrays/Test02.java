package com.cc.day05.arrays;

/**
 * Created by vv on 2018/7/14.
 */
public class Test02 {
    public static void main(String[] args) {
        //声明
        int[] a;
        int b[];
        //创建数组对象
        a = new int[4];
        b = new int[5];
        //初始化（对数数组元素的初始化）
        //默认初始化：数组元素相当于对象的成员变量，默认值跟成员变量的规则一样、
        // 数字0,布尔false,char \u0000,引用类型null
        //动态初始化
        a[0] = 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 12;
        }
        //静态初始化
        int c[] = {21, 52, 33, 44};//长度是4，索引范围是[0,3]
        Car[] cars={new Car("奔驰")};
    }
}
