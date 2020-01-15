package com.dynamic.proxy.human;

/**
 * @Author zp
 * @create 2020/1/15 10:56
 */
public class Me implements Human {
    @Override
    public void eat() {
        System.out.println("我在吃");
    }

    @Override
    public void run() {
        System.out.println("我在跑");
    }

    @Override
    public void seeDoctor() {
        System.out.println("我在看病");
    }
}
