package com.sigleton;

/**
 * 懒汉模式
 */
public class Person2 {
    public  static Person2 person;

    public  String name;

    public static synchronized Person2 getPerson() {
        if (person == null) {
            person = new Person2();
        }
        return person;
    }
}
