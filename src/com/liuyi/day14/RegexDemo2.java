package com.liuyi.day14;

import java.util.Scanner;

/**
 * Created by vv on 2018/8/11.
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String qq = scanner.nextLine();
        System.out.println("checkQQ:" + checkQQ(qq));
    }

    //判断QQ号码
    public static boolean checkQQ(String qq) {
        String regex = "[1-9][0-9]{4,14}";
        boolean flag = qq.matches(regex);
        return flag;
    }
}
