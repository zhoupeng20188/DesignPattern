package com.strategy.pattern.sample1;

import java.util.List;

/**
 * 传统下的策略模式
 */
public class Main {
    static List<Strategy> strategyList;
    public static void main(String[] args) {
        NineOffStrategy nineOffStrategy = new NineOffStrategy();
        ShoppingMall shoppingMall = new ShoppingMall(nineOffStrategy);
        shoppingMall.getStrategy().doStrategy();
        shoppingMall.setStrategy(new EightOffStrategy());
        shoppingMall.getStrategy().doStrategy();

    }

}
