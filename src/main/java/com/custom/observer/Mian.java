package com.custom.observer;

public class Mian {
    public static void main(String[] args) {
        Person s1 = new Person();
        Observer ob1 = new Observer1();
        Observer ob2 = new Observer2();
        s1.addObserver(ob1);
        s1.addObserver(ob2);
        s1.setName("dfdfdfd");
        System.out.println("-----------------");
        s1.deleteObserver(ob1);
        s1.setName("dfdfdfd22222");
    }
}
