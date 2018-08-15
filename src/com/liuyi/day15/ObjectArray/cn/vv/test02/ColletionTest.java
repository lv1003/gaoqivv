package com.liuyi.day15.ObjectArray.cn.vv.test02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by vv on 2018/8/14.
 * 需求存储字符串并遍历
 */
public class ColletionTest {
    public static void main(String[] args) {
        Collection c= new ArrayList<>();
        c.add("小红帽");
        c.add("风清扬");
        c.add("风清扬");
        c.add("风清扬");
        Iterator iterator=c.iterator();
        while (iterator.hasNext()){
             String s=(String)iterator.next();
            System.out.println(s);
        }

    }
}
