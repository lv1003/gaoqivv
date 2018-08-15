package com.liuyi.day04;

/**
 * Created by vv on 2018/7/23.
 */
public class CunQiaan {
    public static void main(String[] args) {
        //数据类型搞得鬼   省略了好多，增加了存钱天数

//每天存钱 2.5元
        double sum = 2.5;
        double i = 0;
        int count = 1;
        while (true) {
            i += sum;
            //存钱超过100元 ，看是花了多少天
            if (i >= 100) {
                System.out.println(count);
                break;
            }
            //天数是5的倍数就花6元钱
            if (count % 5 == 0) {
                i -= 6;
            }
            count++;
        }

    }
}
