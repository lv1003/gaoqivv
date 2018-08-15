package com.liuyi.day09;

/**
 * Created by vv on 2018/8/3.
 * 定义动物培训接口
 */
interface AnimalTrain {
    public abstract void jump();
}
 class Dog implements AnimalTrain{
     public void jump(){
         System.out.println("狗急跳墙！");
     }
 }

public interface InterfaceDemo {
    public static void main(String[] args) {
        AnimalTrain animalTrain=new Dog();
        animalTrain.jump();

    }
}
