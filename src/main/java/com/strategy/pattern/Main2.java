package com.strategy.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟spring使用的策略模式
 */
public class Main2 {
    static List<Strategy> strategyList;
    public static void main(String[] args) {

        // 模拟从xml中初始化所有策略列表
        strategyList = new ArrayList();
        strategyList.add(new NineOffStrategy());
        strategyList.add(new EightOffStrategy());
        // end

        // 根据i得到对应的策略,i是从request的参数中传过来的
        // 这样一来，如果我们要增加一种策略，只需要新建一个类，在xml里配置
        // 之前的代码是不用动的，前端i传3过来即使用新的策略
        getStrategy(1).doStrategy();
        getStrategy(2).doStrategy();


    }

    public static Strategy getStrategy(Integer i){
        for (Strategy strategy : strategyList) {
            if(strategy.support(i)){
                return strategy;
            }
        }
        return null;
    }
}
