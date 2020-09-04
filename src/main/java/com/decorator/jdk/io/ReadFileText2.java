package com.decorator.jdk.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * JKD中IO的装饰者模式
 * @Author zp
 * @create 2020/9/4 14:38
 */
public class ReadFileText2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
        String str = null;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }

    }
}
