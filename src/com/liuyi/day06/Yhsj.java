package com.liuyi.day06;

import java.util.Scanner;

/**
 * Created by vv on 2018/7/30.
 */
public class Yhsj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据：");
        int n = scanner.nextInt();
        //定义二位数组
        int[][] arr = new int[n][n];
        //给第一列和最后一列赋值1
        for (int x = 0; x < arr.length; x++) {
            arr[x][0] = 1;//任何一行的第一列
            arr[x][x] = 1;//任何一行的最后一列
        }

        for (int x = 2; x < arr.length; x++) {
            for (int y = 1; y <= x; y++) {
                arr[x][y] = arr[x - 1][y - 1] + arr[x - 1][y];
            }
        }
        //遍历这个二维数组
        for (int x = 0; x < arr.length; x++) {
            //内循环和九九乘法表类似
            for (int y = 0; y <= x; y++) {
                System.out.print(arr[x][y] + "\t");
            }
            System.out.println();
        }
    }

}
