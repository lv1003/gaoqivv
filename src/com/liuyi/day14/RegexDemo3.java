package com.liuyi.day14;

/**
 * Created by vv on 2018/8/11.
 */
public class RegexDemo3 {
    public static void main(String[] args) {
        String s = "aa,bb,cc";
        String[] str1Array = s.split(",");
        for (int x = 0; x < str1Array.length; x++) {
            System.out.println(str1Array[x]);
        }
        System.out.println("---------------------------------------");
        String s1 = "aa.bb.cc";
        String[] strArray = s.split("\\.");
        for (int x = 0; x < strArray.length; x++) {
            System.out.println(strArray[x]);
        }
        System.out.println("-----------");
    }
}
