package com.dynamic.proxy.jdk.human;

/**
 * 静态代理，必须事先知道要代理的类，而且每个类要代理就必须新建一个代理类
 * 即时这个代理类做的事情是一样的。
 * 动态代理，则是动态生成代理对象，并不用我们手动创建代理类，而且可以一个代理类为多个类服务
 * 如下面的例子中的，黄牛既可以为我排队，也可以为狗狗排队
 * 好处：Proxy类的代码量可以被固定下来，不会因为业务量的增大而增大
 * 每次只需要传入需要代理的类即可生成代理对象
 * @Author zp
 * @create 2020/1/15 10:57
 */
public class Main {
    public static void main(String[] args) {
        Huangniu huangniu = new Huangniu();
        Human human = (Human) huangniu.getInstance(new Me());
        human.eat();
        human.run();
        human.seeDoctor();
        System.out.println("====================");
        Animal animal = (Animal) huangniu.getInstance(new Dog());
        animal.eat();
        animal.run();
        animal.seeAnimalDoctor();
    }
}
