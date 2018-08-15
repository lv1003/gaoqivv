package com.liuyi.day15.ObjectArray.cn.vv.test01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by vv on 2018/8/13.
 * 集合的遍历 以此获取集合的每一个元素 单独的拿到
 * Object [] toArray()   转换为数组 遍历数组
 * Iterator iterator()
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection collection = new ArrayList<>();
        collection.add("aaa555");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");
        Object [] objs=collection.toArray();
        for (int i=0;i<objs.length;i++){
            System.out.print(objs[i]);
            String s=(String)objs[i];
            System.out.println("  "+s.length());
        }
    }
}
