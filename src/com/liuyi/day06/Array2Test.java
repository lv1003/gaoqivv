package com.liuyi.day06;

/**
 * Created by vv on 2018/7/30.
 */
public class Array2Test {
    public static void main(String[] args) {
        //定义一个二维数组
        int[] []arr={{1,2,3},{4,5,6},{7,8,9}};
        printArray2(arr);
    }
    /*
     需求：遍历二维数组
     两个明确：
          返回值类型：void
          参数列表：int[][]arr

 */
    public static void printArray2(int[][]arr){
        // arr[0]={1,2,3};
        //外循环控制二维数组的长度，其实就是一维数组的个数。
        //内循环控制的是一维数组的长度。

        for (int x=0;x<arr.length;x++){
            for (int y=0;y<arr[x].length;y++){
                System.out.print(arr[x][y]+"");
            }
            System.out.println();
        }
    }
}
