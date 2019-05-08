package com.static1.proxy;

/**
 * 静态代理
 */
public class CalculatorProxy {
    private Calculator calculator;
    public CalculatorProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    public int add(int a, int b){
        doBefore();
        int result = calculator.add(a,b);
        doAfter();
        return result;
    }
    
    public void doBefore(){
        System.out.println("do before");
    }
    
    public  void doAfter(){
        System.out.println("do after");
    }
}
