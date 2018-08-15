package com.cc.day01;

/**
 * Created by vv on 2018/7/9.
 */
public class DiGui {
    static int a = 0;
    public static void main(String[] args) {
        test01();
        System.out.println(factorial(5));
    }

    public static void test01() {
        a++;
        System.out.println("test01()");
        if(a<=1000){
            test01();
        }else {
            System.out.println("over" );
        }

    }


//递归调用  计算阶乘
    public static long factorial(int n){
        if(n==1){
            return 1;
        }else {
            return  n*factorial(n-1);
        }
    }
}
