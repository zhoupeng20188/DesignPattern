package com.chain.of.responsibility;

public class TailHandler extends CarHandler {
    public CarHandler setNextHandler(CarHandler carHandler) {
        this.carHandler = carHandler;
        return this.carHandler;
    }

    public void handlerCar() {
        System.out.println("handle car's tail");
        this.nextHandlerCar();
    }
}
