package com.sigleton;

/**
 * 双重检查
 */
public class Person3 {
    public  static Person3 person;

    public  String name;

    public static Person3 getPerson() {
        if (person == null) {
            synchronized (Person3.class){
                if (person == null) {
                    person = new Person3();
                }
            }
        }
        return person;
    }
}
