package com.liuyi.day03;

import java.util.Scanner;

/**
 * Created by vv on 2018/7/20.
 * 模拟单项选择题。
 * 分析：
 * A 出一个选择题 然后供你选择
 * B 键盘路数选择数据
 * C 根据选择给出答案
 */
public class SwitchTest2 {
    public static void main(String[] args) {
        //出一个选择题 然后供你选择
        //由于我们现在没有办法键盘录入得到一个‘a’，‘b’
        //强制转换为字符类型
        System.out.println("你最爱谁");
        System.out.println("65 林青霞");
        System.out.println("66 青霞");
        System.out.println("67 霞");
        System.out.println("67 王力宏");
        //键盘录入选择的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的选择：");
        int choiceNumber = scanner.nextInt();
        //强制转换为字符类型
        char choise = (char) choiceNumber;
        switch (choise) {
            case 'A':
                System.out.println("恭喜你，选择正确");
                break;
            case 'B':
                System.out.println("选择bu正确");
                break;
            case 'C':
                System.out.println("选择bu正确");
                break;
            case 'D':
                System.out.println("选择bu正确");
                break;
            default:
                System.out.println("没有选项");
                break;
        }
    }
}
