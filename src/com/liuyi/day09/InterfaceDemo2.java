package com.liuyi.day09;

/**
 * Created by vv on 2018/8/3.
 */


interface Inter{
    public int num=10;
    public final int num2=20;

}
class InterImpl implements Inter{

}

public class InterfaceDemo2 {
    public static void main(String[] args) {
   Inter inter=new InterImpl();

    }
}
