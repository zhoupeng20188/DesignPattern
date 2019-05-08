package com.decorator;

public class FlyCarDecorator extends CarDecorator {
    public FlyCarDecorator(Car car){
        super(car);
    }

    @Override
    public void show() {
        super.car.show();
        this.fly();
        
    }
    public  void fly() {
        System.out.println("i can fly !");
    }

    public String getInfo(){
        return car.getInfo() + ",fly";
    }
}
