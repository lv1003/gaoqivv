package com.liuyi.day14;

import java.util.Scanner;

/**
 * Created by vv on 2018/8/11.
 */
public class RegexTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入邮箱：");
        String email = scanner.nextLine();

        String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";

        boolean flag = email.matches(regex);
        System.out.println("flag=" + flag);

    }
}
