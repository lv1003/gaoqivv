package com.cc.day02;

import java.util.Map;

/**
 * Created by vv on 2018/7/10.
 */
public class Point {


    double x, y, z;

    //构造方法，初始化属性
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double distance(Point point) {
        double result = Math.sqrt((x - point.x) * (x - point.x) + (y - point.y) * (y - point.y) + (z - point.z) * (z - point.z));
        return result;
    }

    public static void main(String[] args) {
        Point point = new Point(10, 10,10);
        Point point1=new Point(0,0,0);
      double ds=  point.distance(point1);
        System.out.println(point.x);
        System.out.println(ds);
    }
}
