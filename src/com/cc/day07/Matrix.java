package com.cc.day07;

/**
 * Created by vv on 2018/7/17.
 */
public class Matrix {
    public static void print(int[][]c){
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 3,5},
                {2, 4,6},
                {2, 4,0},
        };
        int[][] b = {
                {1, 3,5},
                {2, 4,6},
                {2, 4,3},
        };

        int[][]c=add(a,b);
        print(c);
    }
        public static int[][] add(int[][]a, int[][]b){
            int[][] c = new int[a.length][b.length];
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c.length; j++) {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            return c;
    }
}
