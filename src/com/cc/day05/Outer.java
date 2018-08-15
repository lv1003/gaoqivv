package com.cc.day05;

/**
 * Created by vv on 2018/7/13.
 */
public class Outer {
    public static void main(String[] args) {
        Face face = new Face();
        Face.Nose nose = face.new Nose();
        nose.breath();
        Face.Ear ear = new Face.Ear();//不用外部类的对象
        ear.listen();
    }
}

class Face {
    int type;
    String shap = "瓜子脸";
    static int number=6;

    class Nose {
        String type;

        void breath() {
            System.out.println(shap);
            System.out.println(Face.this.type);//face 的 int 类型的type
            System.out.println(this.type);//自己  String类型的type
            System.out.println("呼吸！");
        }
    }
    static class Ear {
        void listen() {
            System.out.println(number);
            System.out.println("我在听！");
        }
    }
}