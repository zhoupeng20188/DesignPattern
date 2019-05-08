package com.custom.observer;

public class Observer1 implements Observer {
    public void update(String arg) {
        System.out.println("observer1 has reviced change " + "name is " + arg);
    }
}
