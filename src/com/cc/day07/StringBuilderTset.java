package com.cc.day07;

/**
 * Created by vv on 2018/7/16.
 */
public class StringBuilderTset {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        stringBuilder.delete(3, 5).delete(1, 2);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        //对象锁   线程安全的   有关数组的练习
        StringBuffer stringBuffer = new StringBuffer();


    }
}
