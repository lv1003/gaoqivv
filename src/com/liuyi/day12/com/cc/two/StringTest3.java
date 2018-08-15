package com.liuyi.day12.com.cc.two;

/**
 * Created by vv on 2018/8/8.
 */
public class StringTest3 {
    public static void main(String[] args) {
        String maxString = "ololololololololololfdsfsdffgfdgfgfllololololololololololo";
        String minString = "ol";
        int count = getCount(maxString, minString);
        System.out.println("Java在大串中出现了："+count+"次");

    }

    public static int getCount(String maxString, String minString) {
        //定义一个统计变量，初始化是0
        int count = 0;
        int index = maxString.indexOf(minString);
        while (index != -1) {
            count++;
            int startIndex = index + minString.length();
            maxString = maxString.substring(startIndex);
            //继续查
            index = maxString.indexOf(minString);

        }
        return count;
    }

}
