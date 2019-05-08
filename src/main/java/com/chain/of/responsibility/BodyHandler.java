package com.chain.of.responsibility;

public class BodyHandler extends CarHandler {
    public CarHandler setNextHandler(CarHandler carHandler) {
        this.carHandler = carHandler;
        return this.carHandler;
    }

    public void handlerCar() {
        System.out.println("handle car's body");
        this.nextHandlerCar();
    }
}
