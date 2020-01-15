package com.dynamic.proxy.calculator;

public class ProxyTest {
    public static void main(String[] args) {
        Calculator proxy = CalculatorProxyFactory.getCalculatorProxy();
        int result = proxy.add(1,1);
        System.out.println(result);
    }
}
