package com.java.api.observer;

import java.util.Observable;
import java.util.Observer;


/**
 * 观察者1
 */
public class Observer1 implements Observer {
    public void update(Observable o, Object arg) {
        String name = (String) arg;
        System.out.println("Observer1 have recived changes!" + " name is " + name);
    }
}
