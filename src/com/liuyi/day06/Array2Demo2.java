package com.liuyi.day06;

/**
 * Created by vv on 2018/7/30.
 */
public class Array2Demo2 {
    public static void main(String[] args) {
        //定义数组
        int[][]arr=new int[3][];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //动态的为每一个一维数组 分配空间
        arr[0]=new int[2];
        arr[1]=new int[3];
        arr[2]=new int[1];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
