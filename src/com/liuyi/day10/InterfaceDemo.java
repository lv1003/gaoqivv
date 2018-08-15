package com.liuyi.day10;

/**
 * Created by vv on 2018/8/3.
 */

interface SpeakEnglish {
    public abstract void speak();
}

abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sleep() {
        System.out.println("人都是要睡觉的！");
    }

    public abstract void eat();
}

abstract class Sporter extends Person {
    public Sporter() {

    }

    public Sporter(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}

abstract class Coach extends Person {
    public Coach() {

    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}

//乒乓球运动员
class PingPangPlayer extends Sporter implements SpeakEnglish {
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("吃乒乓球");
    }

    public void study() {
        System.out.println("学习胡旋球");
    }

    public void speak() {
        System.out.println("乒乓球运动员说英语！");
    }
}

//篮球运动员
class BasketballPlayer extends Sporter implements SpeakEnglish {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("吃篮球");
    }

    public void study() {
        System.out.println("学习扣篮");
    }

    public void speak() {
        System.out.println("篮球运动员说英语！");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

    }

}
