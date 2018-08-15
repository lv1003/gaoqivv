package com.liuyi.day05;

import java.util.Scanner;

/**
 * Created by vv on 2018/7/24.
 */
public class Max {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
          int a=console.nextInt();
        int b=console.nextInt();
        System.out.println(getMax(a,b));
    }

    public static int getMax(int a, int b) {
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        return max;
    }

}
