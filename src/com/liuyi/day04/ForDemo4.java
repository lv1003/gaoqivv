package com.liuyi.day04;

/**
 * Created by vv on 2018/7/21.
 */
public class ForDemo4 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
