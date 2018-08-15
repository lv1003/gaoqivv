package com.liuyi.day14;

import java.util.Random;

/**
 * Created by vv on 2018/8/13.
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random(10000000);//100种子  long范围
        for (int i=0;i<10;i++) {
           // System.out.println(num);
        int num=random.nextInt(100)+1;
            System.out.println(num);
        }


    }
}
