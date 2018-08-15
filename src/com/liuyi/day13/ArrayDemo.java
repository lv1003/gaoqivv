package com.liuyi.day13;

/**
 * Created by vv on 2018/8/10.
 * 冒泡排序
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 23, 56, 34, 12, 34, 3, 54, 65, 57, 7, 3};
        System.out.println("排序前：");
        printArray(arr);
        System.out.println();
        //冒泡排序后
        moPao(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    public static void moPao(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }


    }

}
