package com.decorator;

public abstract class Car {
    public void run(){
        System.out.println("i can run!");
    }
    public String getInfo(){
        return "i can run";
    }

    public void show() {
        this.run();
    }
}
