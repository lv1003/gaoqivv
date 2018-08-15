package com.liuyi.day16.one;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by vv on 2018/8/15.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        Iterator it =arrayList.iterator();
        while(it.hasNext()){
            String s=(String)it.next();
            System.out.println(s);
        }
        System.out.println("------------------------------------");
        for (int i=0;i<arrayList.size();i++){
            String s= (String) arrayList.get(i);
            System.out.println(s);
        }
    }
}
