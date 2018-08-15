package com.cc.day02;

/**
 * Created by vv on 2018/7/10.
 */
public class TestOverload {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int res = myMath.add(3, 4);
        double vv=myMath.add(4.3,4.6);
        System.out.println(res);
        System.out.println(vv);
    }
}

class MyMath {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b,int c) {
        return a + b+c;
    }
    public double add(double a, double b) {
        return a + b;
    }

}
