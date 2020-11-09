package com.strategy.pattern.smaple2;

/**
 * 策略模式加lambda表达式重构重复代码
 * @Author zp
 * @create 2020/11/9 9:30
 */
public class Main {
    public static void main(String[] args) {
        User user = new User(1, "aaa");
        service((u) -> System.out.println(u.getId() + u.getName() + "=====by function1"), user);
        Friend f = new Friend(2, "bbb", 18);
        service((t) -> System.out.println(t.getId() + t.getName() + t.getAge() + "=====by function2"), f);
    }

    public static <T> void service(MyInterface<T> m, T t) {
        System.out.println("=========处理1");
        m.update(t);
        System.out.println("=========处理2");

    }
}
