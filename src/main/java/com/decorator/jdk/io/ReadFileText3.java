package com.decorator.jdk.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author zp
 * @create 2020/9/4 15:12
 */
public class ReadFileText3 {
    public static void main(String[] args) throws IOException {
        MyToUpperInputStream myToUpperInputStream = new MyToUpperInputStream(new FileInputStream("a.txt"));
        int read = myToUpperInputStream.read();
        while (read != -1){
            System.out.print((char)read);
            read = myToUpperInputStream.read();
        }
    }
}
