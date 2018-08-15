package com.liuyi.day15.ObjectArray.cn.vv.test03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by vv on 2018/8/14.
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList<>();
         Student student1=new Student("vv",21,"man");
         Student student2=new Student("vv",21,"man");
         Student student3=new Student("sv",21,"wman");
         Student student4=new Student("lv",28,"man");
         Student student5=new Student("vv",21,"man");
         Student student6=new Student();
        student6.setAge(11);
        student6.setName("mm");
        student6.setManOrWomen("women");
         collection.add(student1);
         collection.add(student2);
         collection.add(student3);
         collection.add(student4);
         collection.add(student5);
         collection.add(student6);
        collection.add(student6);
          Iterator iterator= collection.iterator();
        while (iterator.hasNext()){
            Student s=(Student) iterator.next();
            System.out.println(s.getName()+"----"+s.getAge()+"----------"+s.getManOrWomen());
        }
    }
}
