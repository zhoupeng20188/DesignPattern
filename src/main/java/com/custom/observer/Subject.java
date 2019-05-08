package com.custom.observer;


import java.util.ArrayList;
import java.util.List;

public interface Subject {
    List<Observer> list = new ArrayList<Observer>();
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers(String arg);

}
