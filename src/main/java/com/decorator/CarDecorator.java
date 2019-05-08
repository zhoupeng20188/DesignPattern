package com.decorator;

public class CarDecorator extends Car {
    public Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }
}
