package com.liuyi.day12.com.cc.two;

/**
 * Created by vv on 2018/8/6.
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = new String();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println("----------------------");
        byte[] bys = {97, 98, 99, 100, 101,};
        String s1 = new String(bys);
        System.out.println("s1=" + s1);
        System.out.println("s1.length()=" + s1.length());
        System.out.println("-------------------------");
        String s2 = new String(bys, 1, 3);
        System.out.println(s2);
        System.out.println("--------------------------");
        char[] c = {'q', 'b', '哎', 'c', 'd', 'e', 'r'};
        String s3=new String(c);
        System.out.println(s3);
        System.out.println(s3.length());
    }
}
