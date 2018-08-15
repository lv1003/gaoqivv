package com.cc.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by vv on 2018/7/23.
 */
public class Test01 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("aaa");
        list.add(new Date());
        list.add(new Dog());
        list.add(1234);//包装类的：自动装箱！
        System.out.println(list.size());//和数组的长度不一样   比容器要小点   容器可以扩容   这是元素的长度
        System.out.println(list.isEmpty());
        //   list.remove("aaa");
        System.out.println(list.size());

        List list1 = new ArrayList<>();
        list1.add("bbb");
        list1.add("ccc");
        list.add(list1);
        //跟顺序有关的操作
        String s = (String) list.get(0);
        System.out.println(s);
        list.set(1, "vvvv");
        list.remove(3);

    }
}

class Dog {
}
