package com.liuyi.day12.com.cc.two;

/**
 * Created by vv on 2018/8/8.
 */
public class String3Demo {
    public static void main(String[] args) {
        String str = "HelloWorlod";
        //字符串转为字节数组
        byte[] bys = str.getBytes();
        for (int i = 0; i < bys.length; i++) {
            System.out.println(bys[i]);
        }
        System.out.println("--------------------");
        //将字符串转换为字符数组
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //将字符数组转为字符串
        String ss = String.valueOf(chars);
        System.out.println(ss);
    }
}
