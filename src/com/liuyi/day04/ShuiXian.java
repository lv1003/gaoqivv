package com.liuyi.day04;

/**
 * Created by vv on 2018/7/22.
 * 153=1*1*1+5*5*5+3*3*3=1+125+27=151
 * 水仙花数
 * A 三位数是告诉了我们范围
 * B通过for循环 我们就可以实现获取每一个三位数    个位   十位  百位
 */
public class ShuiXian {
    public static void main(String[] args) {
        for (int x=100;x<1000;x++){
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;
            if(x==(ge*ge*ge+shi*shi*shi+bai*bai*bai)){
                //如果相同，就把该数据在控制台输出
                System.out.println(x);
            }
        }
    }
}
