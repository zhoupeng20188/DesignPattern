package com.sigleton;

/**
 * 饿汉模式
 */
public class Person {
    public static final Person person = new Person();

    public  String name;

    public static Person getPerson() {
        return person;
    }
}
