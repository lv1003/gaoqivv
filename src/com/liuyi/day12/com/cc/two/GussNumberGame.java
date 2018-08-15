package com.liuyi.day12.com.cc.two;

import java.util.Scanner;

/**
 * Created by vv on 2018/8/8.
 */
public class GussNumberGame {
    private GussNumberGame(){

    }
   public static void start(){
        //产生一个随机数
       int number=(int)(Math.random()*100)+1;
       while(true){
           Scanner scanner=new Scanner(System.in);
           System.out.println("请输入你要猜的数据（1-100）：");
           int guessNumber=scanner.nextInt();
           if(guessNumber>number){
               System.out.println("你猜的数据"+guessNumber+"大了");
           }else if (guessNumber<number){
               System.out.println("你猜的数据"+guessNumber+"小了");
           }else {
               System.out.println("恭喜答对了！");
               break;
           }
       }

   }
}
