package com.sigleton;

public class ThreadTest extends Thread {
    Person3 person= Person3.getPerson();
    @Override
    public void run() {
        System.out.println("run is called " + Thread.currentThread().getName() + " 's person name is " + person.name);
    }
    public void setPersonName(String name){
        person.name = name;
        System.out.println("setPersonName is called " + Thread.currentThread().getName() + " 's person name is " + person.name);
    }
}
