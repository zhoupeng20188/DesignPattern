package com.dynamic.proxy.human;

/**
 * @Author zp
 * @create 2020/1/15 11:02
 */
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗狗吃");
    }

    @Override
    public void run() {
        System.out.println("狗狗跑");
    }

    @Override
    public void seeAnimalDoctor() {
        System.out.println("狗狗看医生");
    }
}
