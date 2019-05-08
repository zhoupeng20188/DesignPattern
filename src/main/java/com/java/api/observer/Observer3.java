package com.java.api.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者3
 */
public class Observer3 implements Observer {
    public void update(Observable o, Object arg) {
        String name = (String) arg;
        System.out.println("Observer3 have recived changes!" + " name is " + name);
    }
}
