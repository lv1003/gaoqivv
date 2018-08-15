package com.liuyi.day14;

/**
 * Created by vv on 2018/8/13.
 */
public class SystemDemo {
    public static void main(String[] args) {
        Person person = new Person("赵雅芝", 15);
        System.out.println(person);
        person=null;//让person 不再指向堆内存
        System.gc();
    }
}
