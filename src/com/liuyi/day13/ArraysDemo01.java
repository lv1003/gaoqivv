package com.liuyi.day13;

import java.util.Arrays;

/**
 * Created by vv on 2018/8/10.
 */
public class ArraysDemo01 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 65, 23, 53, 62, 16, 32, 58, 19, 10, 11};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        //排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //排序操作   二分法查找要求元素是有序的
        System.out.println("binarySearch:" + Arrays.binarySearch(arr, 23));

    }
}
