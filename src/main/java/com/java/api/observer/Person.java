package com.java.api.observer;

import java.util.Observable;

/**
 * 主题
 */
public class Person extends Observable {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.setChanged();
        this.notifyObservers(name);
    }
}
