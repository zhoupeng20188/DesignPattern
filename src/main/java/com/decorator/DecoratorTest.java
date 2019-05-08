package com.decorator;

/**
 * 测试类
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Car car = new RunCar();
        Car flycar = new FlyCarDecorator(car);
        flycar.show();
        System.out.println("--------------");
        Car swimflycar = new SwimCarDecorator(flycar);
        swimflycar.show();
        System.out.println(swimflycar.getInfo());
    }
}
