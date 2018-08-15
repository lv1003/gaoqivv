package com.liuyi.day15.ObjectArray.cn.vv.test03;

/**
 * Created by vv on 2018/8/14.
 */
public class Student {
    private String name ;
    private  int age ;
    private String manOrWomen;

    public Student() {
    }

    public Student(String name, int age, String manOrWomen) {
        this.name = name;
        this.age = age;
        this.manOrWomen = manOrWomen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManOrWomen() {
        return manOrWomen;
    }

    public void setManOrWomen(String manOrWomen) {
        this.manOrWomen = manOrWomen;
    }
}
