package com.strategy.pattern.sample1;

public class NineOffStrategy implements Strategy {
    public boolean support(Integer i) {
        return i == 1 ? true : false;
    }

    public void doStrategy() {
        System.out.println("打9折");
    }
}
