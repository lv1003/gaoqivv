package com.liuyi.day15.ObjectArray.cn.vv.test02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by vv on 2018/8/14.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList<>();
        collection.add("hello");
        collection.add("world");
        collection.add("sito");
        collection.add("bye");
       // Iterator iterator = collection.iterator();
        //    Object obj=iterator.next();
     /*   while (iterator.hasNext()) {
            String str = (String) iterator.next();
            System.out.println(str);
        }*/
        //for 循环改写   效率高
        for(  Iterator iterator = collection.iterator();iterator.hasNext();){
            String str = (String) iterator.next();
            System.out.println(str);
        }
    }
}
