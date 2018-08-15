package com.liuyi.day06;

/**
 * Created by vv on 2018/7/31.
 */
public class JiaMiDemo {
    public static void main(String[] args) {
        //定义数据
        int number = 123456;
        //定义数组
        int[] arr = new int[8];
        //把数据中每一位上的数据获取到后存储到数组中
        int index = 0;
//        arr[index]=number%10;//array[0]=6;
//        index++;
//        arr[index]=number/10%10;//array[1]=5;

        while (number > 0) {
            arr[index] = number % 10;
            index++;
            number /= 10;
        }


        for (int x = 0; x < index; x++) {
            arr[x] += 5;
            arr[x] %= 10;

        }
        //第一位 最后一位交换
        int temp = arr[0];
        arr[0] = arr[index - 1];
        arr[index - 1] = temp;


        //输出数据
        for (int x = 0; x < index; x++) {
            System.out.print(arr[x]);
        }
    }
}
