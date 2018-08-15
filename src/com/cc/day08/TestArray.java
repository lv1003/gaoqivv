package com.cc.day08;

import java.util.Arrays;

/**
 * Created by vv on 2018/7/18.
 */
public class TestArray {
    public static void main(String[] args) {
        int[] a = {3, 56, 46, 68, 35, 57, 67, 878768, 46, 12};
//增强循环 i是零时变量   右边是数组
        for (int i : a) {
            System.out.println("foreach="+i);
        }
        Arrays.sort(a);
        System.out.println("a[]=" + Arrays.toString(a));//toString  和object的toString什么关系？
        System.out.println("该元素的索引：" + Arrays.binarySearch(a, 12));
        Arrays.fill(a, 2, 4, 100);
        System.out.println("a[]=" + Arrays.toString(a));//将2,4 的元素填充成100
    }
}
