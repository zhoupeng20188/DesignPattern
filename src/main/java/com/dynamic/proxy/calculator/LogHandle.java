package com.dynamic.proxy.calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 */
public class LogHandle implements InvocationHandler {

    Object obj;

    LogHandle(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.doBefore();
        Object o = method.invoke(obj,args);
        this.doAfter();
        return o;
    }

    public void doBefore() {
        System.out.println("do before");
    }

    public void doAfter() {
        System.out.println("do after");
    }
}
