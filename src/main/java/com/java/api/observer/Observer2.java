package com.java.api.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者2
 */
public class Observer2 implements Observer {
    public void update(Observable o, Object arg) {
        String name = (String) arg;
        System.out.println("Observer2 have recived changes!" + " name is " + name);
    }
}
