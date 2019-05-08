package com.decorator;

public class SwimCarDecorator extends CarDecorator {
    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        super.car.show();
        this.swim();

    }

    public void swim() {
        System.out.println("i can swim!");
    }

    public String getInfo(){
        return car.getInfo() + ",swim";
    }
}
