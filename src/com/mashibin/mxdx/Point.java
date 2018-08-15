package com.mashibin.mxdx;

/**
 * Created by vv on 2018/7/24.
 */
public class Point {
    double x, y, z;

    Point(double _x, double _y, double _z) {
        x = _x;
        y = _y;
        z = _z;
    }
     void setX(double _x){
         x=_x;
     }

    double getDistance(Point point){
    return (x- point.x)*(x-point.x)+(y- point.y)*(y-point.y)+(z-point.z)*(z-point.z);

    }

}


 class TestPoint{
    public static void main(String[] args) {
         Point point=new Point(1.0,2.0,3.0);
        Point point1=new Point(0.0,0.0,0.0);
        System.out.println(point.getDistance(point1));
        point.setX(5.0);
        System.out.println(point.getDistance(new Point(3.0,4.5,6.5)));
    }
}