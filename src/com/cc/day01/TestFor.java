package com.cc.day01;

/**
 * Created by vv on 2018/7/9.
 */
public class TestFor {
    public static void main(String[] args) {
        int oddSum = 0;//用来保存奇数
        int evenSum=0;//用来保存偶数
        for (int i = 1; i <= 100; i+=1) {//初始化 条件判断  迭代
            if(i%2!=0){
            oddSum=oddSum+i;
            }else {
                evenSum=evenSum+i;
            }
        }
        System.out.println("oddSum=" + oddSum);
        System.out.println("evenSum=" + evenSum);
    }
}
