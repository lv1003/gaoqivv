package com.liuyi.day15.ObjectArray.cn.vv.test01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by vv on 2018/8/13.
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");
        collection.add("eee");
        Collection collection1 = new ArrayList<>();
        collection1.add("abc");
        collection1.add("abc2");
        collection1.add("abc3");
        collection1.add("abc4");
      //  collection1.add("eee");
        System.out.println("clooectin:"+collection);
        System.out.println("clooectin1:"+collection1);
        System.out.println("addAll:"+collection.addAll(collection1));
        System.out.println("clooectin:"+collection);
        System.out.println("removeAll:"+collection.removeAll(collection1));
        System.out.println(collection);
        //containsAll  只有包含所有的元素才叫包含
        System.out.println("containsAll:"+collection.containsAll(collection1));
        // 两个集合AB a对b交集 最终结果 保存A 中B不变    返回值表示A 是否发生过改变  有改变为false
        System.out.println("containsAll:"+collection.retainAll(collection1));
    }
}
