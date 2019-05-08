package com.chain.of.responsibility;

public abstract class CarHandler {
    CarHandler carHandler;

    public abstract CarHandler setNextHandler(CarHandler carHandler);

    public abstract void handlerCar();

    public void nextHandlerCar(){
        if (this.carHandler != null) {
            this.carHandler.handlerCar();
        }
    };
}
