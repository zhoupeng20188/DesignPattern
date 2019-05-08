package com.prototype;

public class Person implements Cloneable{
    public String name;
    public String add;
    public int age;

    public Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }

}
