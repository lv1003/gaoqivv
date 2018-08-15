package com.liuyi.day03;

/**
 * Created by vv on 2018/7/16.
 */
public class IfDemo04 {
    public static void main(String[] args) {
        //获取两个数据的最大值
        int a = 10;
        int b = 20;
        int max1;
        if (a > b) {
            max1 = a;
        } else {
            max1 = b;
        }
        System.out.println("ma=" + max1);

//三元实现
        int max = (a > b) ? a : b;
        System.out.println("max=" + max);
//判断一个数是偶数还是奇数   不能用三元改造
        int x = 100;
        if (x % 2 == 0) {
            System.out.println("100是偶数");
        } else {
            System.out.println("100是奇数");
        }
    }
}
