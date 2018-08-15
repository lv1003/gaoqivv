package com.liuyi.day03;

import java.util.Scanner;

/**
 * Created by vv on 2018/7/18.
 */
public class IfDemo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的考试成绩：");
        int score = scanner.nextInt();
        if (90 <= score && score <= 100) {
            System.out.println("优秀");
        }else if (score>=80&&score<90){
            System.out.println("好");
        }else if (score>=70&&score<80){
            System.out.println("良");
        }else if(score>=60&&score<70){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }

        //测试 正确数据 错误数据 边界数据     我们刚才写的程序   并没有处理错误数据   所以这个程序
    }
}
