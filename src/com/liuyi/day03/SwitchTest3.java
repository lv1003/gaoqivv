package com.liuyi.day03;

import java.util.Scanner;

/**
 * Created by vv on 2018/7/20.
 */
public class SwitchTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入字符串：");
        String s = scanner.nextLine();
        switch (s) {
            case "hello":
                System.out.println("yes hello");
                break;
            case "want":
                System.out.println("yes want");
                break;
            default:
                System.out.println("nono !");
                break;
        }
    }
}
