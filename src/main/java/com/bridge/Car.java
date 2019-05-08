package com.bridge;

public abstract class Car implements Engine {
    public Engine engine;

    public void insallEngine() {
        engine.insallEngine();
    }
}
