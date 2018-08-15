package com.liuyi.day15.ObjectArray.cn.vv.test01;

/**
 * Created by vv on 2018/8/13.
 * 我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。
 * 学生：Student
 * 成员变量：name,age
 * 构造方法：无参,带参
 * 成员方法：getXxx()/setXxx()
 */
public class ObejectArrayDemo {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        Student s1 = new Student("林青霞", 27);
        Student s2 = new Student("风清扬", 22);
        Student s3 = new Student("牛魔王", 111);
        Student s4 = new Student("红孩儿", 34);
        Student s5 = new Student("孙悟空", 33);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;
     /*   for (int x=0;x<students.length;x++){
            students[x]=s(x+1);
        }*/
        for (int x = 0; x < students.length; x++) {
            // System.out.println(students[x]);
            Student s = students[x];
            System.out.println(s.getAge()+"====="+s.getName());
        }
    }
}
