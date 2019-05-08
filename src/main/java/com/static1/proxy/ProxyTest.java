package com.static1.proxy;



public class ProxyTest {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImp();
        CalculatorProxy proxy = new CalculatorProxy(calculator);
        System.out.println(proxy.add(1,1));

    }
}
