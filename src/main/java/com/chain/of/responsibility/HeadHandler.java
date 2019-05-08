package com.chain.of.responsibility;

public class HeadHandler extends CarHandler {
    public CarHandler setNextHandler(CarHandler carHandler) {
        this.carHandler = carHandler;
        return this.carHandler;
    }

    public void handlerCar() {
        System.out.println("handle car's head");
        this.nextHandlerCar();
    }
}
