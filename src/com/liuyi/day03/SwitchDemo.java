package com.liuyi.day03;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by vv on 2018/7/20.
 */
public class SwitchDemo {
    public static void main(String[] args) {
        //创建键盘录入的对象
        Scanner scanner = new Scanner(System.in);
        //控制键盘录入数据
        System.out.println("请输入一个数据(1-7):");
        int week = scanner.nextInt();
        //switch 判断语句
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("你输入的数据有误");
                break;
        }
    }
}
