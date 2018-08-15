package com.cc.day04;

import java.awt.*;

/**
 * Created by vv on 2018/7/12.
 */
public class PaintFrame {
    public static void drawFrame(IMyFrame myFrame) {
        System.out.println("启动线程");
        System.out.println("增加循环");
        System.out.println("查看消息栈");
        //画窗口
        myFrame.paint();//挂勾子   回调函数
        System.out.println("启动缓存，增加效率");
    }

    public static void main(String[] args) {
        drawFrame(new SysFrame());
    }
}
class GameFrame01 implements IMyFrame{
    public void paint(){
        System.out.println("GameFrame01.print()");
        System.out.println("画窗口！");
    }
}
class SysFrame implements IMyFrame{
    public void paint(){
        System.out.println(" SysFrame .print()");
        System.out.println("画窗口！ SysFrame ");
    }
}