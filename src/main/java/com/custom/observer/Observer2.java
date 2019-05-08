package com.custom.observer;

public class Observer2 implements Observer {
    public void update(String arg) {
        System.out.println("observer2 has reviced change " + "name is " + arg);
    }
}
