package com.liuyi.day14;

/**
 * Created by vv on 2018/8/11.
 */
public class RegexTest01 {
    public static void main(String[] args) {
        String str = "91 27 46 28 35 54 22";
        //分割字符串
        String[] strArray = str.split(" ");
        //将字符串数组转为 int 数组
        int[] arr = new int[strArray.length];
       for(int x=0;x<arr.length;x++){
           //将字符串数组转为int数组  直接转不行，用Integer.parseInt（）;
           arr[x]=Integer.parseInt(strArray[x]);
       }
    }
}
