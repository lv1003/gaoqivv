package com.liuyi.day03;

import java.util.Scanner;

/**
 * Created by vv on 2018/7/20.
 */
public class IfTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入x的值");
        int x = scanner.nextInt();
        int y;
        if (x >= 3) {
            y = 2 * x + 1;
        }else if(x>=-1&&x<3){
            y=2*x;
        }else {
            y=2*x-1;
        }
        System.out.println("y:"+y);
    }
}
