package com.cc.day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vv on 2018/7/20.
 */
public class TestReadFile {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("c:/a.txt");
            char c = (char) fileReader.read();
            System.out.println(c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
