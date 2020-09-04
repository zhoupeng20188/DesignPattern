package com.dynamic.proxy.jdk.calculator;

import java.lang.reflect.Proxy;

public class CalculatorProxyFactory {
    public static Calculator getCalculatorProxy(){
        Calculator calculator = new CalculatorImp();
        LogHandle lh = new LogHandle(calculator);
        Calculator proxy = (Calculator) Proxy.newProxyInstance(calculator.getClass().getClassLoader(), calculator.getClass().getInterfaces(),lh);
        return proxy;
    }
}
