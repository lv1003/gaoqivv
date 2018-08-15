package com.liuyi.day15.ObjectArray.cn.vv.test01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by vv on 2018/8/13.
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection collection=new ArrayList<>();
        collection.add("hello");
        collection.add("world");
        collection.add("java");
        //collection.clear();
        collection.remove("java");
        System.out.println("collection:"+collection);


    }
}
