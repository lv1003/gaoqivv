package com.liuyi.day14;

import java.util.Scanner;

/**
 * Created by vv on 2018/8/13.
 * 任意范围的随机数
 */
public class MathDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入开始数：");
        int start = scanner.nextInt();
        System.out.println("请输入结束数：");
        int end = scanner.nextInt();
         //调用功能
       int num= getRandom(start,end);
        System.out.println(num);

    }

    public static int getRandom(int start, int end) {
        // int number=(int)(Math.random()*100)+1; (1-100)
        //int number = (int) (Math.random() * end) + start;
        //end-start+1 最大值和最小值之间的范围
        int number=(int)(Math.random()*(end-start+1))+start;
      return number;
    }
}

