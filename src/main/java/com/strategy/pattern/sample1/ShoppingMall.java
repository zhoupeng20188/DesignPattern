package com.strategy.pattern.sample1;

public class ShoppingMall {
    Strategy strategy;

    public ShoppingMall(Strategy strategy) {
        this.strategy = strategy;
    }

    public ShoppingMall() {
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
