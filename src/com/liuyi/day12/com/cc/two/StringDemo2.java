package com.liuyi.day12.com.cc.two;

/**
 * Created by vv on 2018/8/8.
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s = "HelloWorlD";
        //先获取第一个字符
        String a = s.substring(0, 1);
        String b = s.substring(1, s.length());
        String c = a.toUpperCase();
        String d = b.toLowerCase();
        String e = c + d;
        System.out.println(e);
    }
}
