package com.prototype;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        p1.name="zhangsan";
        p1.age = 30;
        p1.add= "dddd";
        Person p2 = p1.clone();
        System.out.println(p2.name);
    }
}
