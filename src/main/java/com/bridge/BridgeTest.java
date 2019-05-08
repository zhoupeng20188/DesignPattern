package com.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Engine engine1 = new Engine2000();
        Engine engine2 = new Engine2200();
        Car car1 = new Bus(engine1);
        car1.insallEngine();
        Car car2 = new Bus(engine2);
        car2.insallEngine();
    }
}
