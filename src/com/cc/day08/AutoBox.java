package com.cc.day08;

/**
 * Created by vv on 2018/7/18.
 * 自动装箱
 * 自动拆箱
 */
public class AutoBox {
    public static void main(String[] args) {
        //  Integer integer=new Integer(1000);
        Integer i = 1000;//5.0  自动装箱   编译器 添加改进  自动包装
        Integer b = 2000;
        int c = new Integer(1500);//数字  对应  对象   这是自动拆箱
        int d = new Integer(123).intValue();//拆箱   编译器 改进
        Integer e=1133;
        Integer f=1133;
        System.out.println(e==f);
        System.out.println(e.equals(f));
        Integer e1=113;
        Integer f1=113;
        System.out.println(e1==f1);  //Integer有常量池 缓存问题[-128,127]当作基本数据类型处理  提高效率
        System.out.println(e1.equals(f1));
    }
}
