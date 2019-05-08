package com.custom.observer;

public class Person implements Subject {
    private String name;

    public void addObserver(Observer observer) {
        list.add(observer);
    }

    public void deleteObserver(Observer observer) {
        if (list.contains(observer)) {
            list.remove(observer);
        }
    }

    public void notifyObservers(String arg) {
        for (Observer ob : list) {
            ob.update(arg);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers(name);
    }
}
