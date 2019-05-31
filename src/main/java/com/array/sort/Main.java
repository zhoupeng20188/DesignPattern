package com.array.sort;

import java.util.Arrays;

/**
 * @Author zp
 * @create 2019/5/31 10:24
 */
public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("duck01", 1),
                new Duck("duck02", 9),
                new Duck("duck03", 3)
        };
        Arrays.sort(ducks);
        for (Duck duck : ducks) {
            System.out.println(duck.getName());
        }
    }
}
