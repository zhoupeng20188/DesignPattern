package com.chain.of.responsibility;

public class CorTest {
    public static void main(String[] args) {
        CarHandler h1 = new HeadHandler();
        CarHandler h2 = new BodyHandler();
        CarHandler h3 = new TailHandler();

        h1.setNextHandler(h3);
        h3.setNextHandler(h2);
        h1.handlerCar();

        System.out.println("----------");

        h3.setNextHandler(h1).setNextHandler(h2);

        h3.handlerCar();
    }
}
