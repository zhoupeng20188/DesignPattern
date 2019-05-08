package com.java.api.observer;

/**
 * 测试类
 */
public class ObserverTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.addObserver(new Observer1());
        p1.addObserver(new Observer2());
        p1.addObserver(new Observer3());
        p1.setName("dfs");
        p1.setName("dfs222");
    }
}
