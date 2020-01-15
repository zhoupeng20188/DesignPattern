package com.dynamic.proxy.human;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author zp
 * @create 2020/1/15 10:50
 */
public class Huangniu implements InvocationHandler {

    Object proxyTarget;

    public Object getInstance(Object o) {
        proxyTarget = o;
        return Proxy.newProxyInstance(o.getClass().getClassLoader(),o.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke;
        if(method.getName().equals("seeDoctor") || method.getName().equals("seeAnimalDoctor")){
            System.out.println("黄牛帮我排队中。。");
            invoke = method.invoke(proxyTarget, args);
            System.out.println("黄牛送我回家中。。");
        } else {
            invoke = method.invoke(proxyTarget, args);
        }

        return invoke;
    }
}
