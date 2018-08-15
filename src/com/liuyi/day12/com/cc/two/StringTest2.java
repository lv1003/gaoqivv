package com.liuyi.day12.com.cc.two;

import java.util.Scanner;
import java.util.function.Supplier;

/**
 * Created by vv on 2018/8/8.
 */
public class StringTest2 {
    public static void main(String[] args) {
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        System.out.println("输入字符串：");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        //String s="AAAzAa1aa111441";
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9'){
                numberCount++;
            }else  if(ch>='a'&&ch<='z'){
                smallCount++;
            }else  if(ch>='A'&&ch<='Z'){
                bigCount++;
            }
        }
        System.out.println("大写"+bigCount);
        System.out.println("数字"+numberCount);
        System.out.println("小写"+smallCount);
    }
}
