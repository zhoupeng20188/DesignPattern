package com.dynamic.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author zhoupeng
 * @Date 2020-03-26 10:49
 */
public class CglibTest {
    public static void main(final String[] args) {
        // cglib代理核心对象
        Enhancer enhancer = new Enhancer();
        // 设置要代理的类
        enhancer.setSuperclass(Tiger.class);
        // 设置代理类
        enhancer.setCallback(new MethodInterceptor() {
            /**
             * 代理对象方法拦截器
             * @param o 代理对象
             * @param method 被代理的类的方法，即Service1中的方法
             * @param objects 调用方法传递的参数
             * @param methodProxy 方法代理对象
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("记录日志");
//                Object invoke = method.invoke(o, objects);
                // 不能用上面的写法，会无限报错，上面的写法需要持有一个Tiger对象
                // 用下面的写法即可，默认会拦截所有方法
                Object invoke = methodProxy.invokeSuper(o,objects);
                return invoke;
            }
        });

        // 获取代理对象
        Tiger tiger = (Tiger) enhancer.create();
        // 调用run方法实际上执行的是回调里的intercept方法
        tiger.run();
    }
}
