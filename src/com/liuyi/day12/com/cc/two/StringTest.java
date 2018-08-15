package com.liuyi.day12.com.cc.two;

import java.util.Scanner;

/**
 * Created by vv on 2018/8/7.
 */
public class StringTest {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin";
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = scanner.nextLine();
            System.out.println("请输入密码：");
            String pwd = scanner.nextLine();
            //比较用户名和密码
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登陆成功！开始玩游戏");
                GussNumberGame.start();
                break;
            } else {
                if((2-i)==0){
                    System.out.println("账号被锁定，联系管理员");
                }
                System.out.println("登陆失败！你还有"+(2-i)+"次机会");

            }
        }

    }
}
