package com.cc.day09;

import java.io.File;
import java.io.IOException;

/**
 * Created by vv on 2018/7/19.
 */
public class TestFile {
    public static void main(String[] args) {
        File file = new File("c:/oi/iv.java");
        File file2 = new File("c:/oi");
        File file3 = new File(file2, "iv.java");
        File file1 = new File("c:/oi/ivvb.java");
        File file4 = new File("C:/oi/dfds/df/d");
        file4.mkdirs();
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (file.isFile()) {
            System.out.println("是一个文件");
        }
        if (file2.isDirectory()) {
            System.out.println("是不是一个目录");
        }

    }
}
