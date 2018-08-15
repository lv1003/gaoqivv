package com.cc.day06;

/**
 * Created by vv on 2018/7/15.
 */
public class TestString {
    public static void main(String[] args) {
    String str=new String("abcd");
        String string=new String("abcd");
        System.out.println(str.equals(string));//equals 是一个值一个值的比较
        System.out.println(str==string);//地址不一样，不同的对象
        System.out.println(str.charAt(2));
    }
}
