package com.liuyi.day14;

import java.util.Scanner;

/**
 * Created by vv on 2018/8/10.
 */
public class RegexDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String qq = scanner.nextLine();
        System.out.println("checkQQ:" + checkQQ(qq));
    }

    //判断QQ号码
    public static boolean checkQQ(String qq) {
        boolean flag = true;
        if (qq.length() >= 5 && qq.length() <= 15) {
            if (!qq.startsWith("0")) {
                char[] chs = qq.toCharArray();
                for (int i = 0; i < chs.length; i++) {
                    char ch = chs[i];
                    if (!Character.isDigit(ch)) {
                        flag = false;
                        break;
                    }
                }
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }
}
