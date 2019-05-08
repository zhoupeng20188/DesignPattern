package com.sigleton;

public class SingletonTest {
    public static void main(String[] args) {
//        Person p1 = Person.getPerson();
//        Person p2 = Person.getPerson();
//        Person2 p1 = Person2.getPerson();
//        Person2 p2 = Person2.getPerson();
        Person3 p1 = Person3.getPerson();
        Person3 p2 = Person3.getPerson();
//        p1.name = "111";
//        p2.name = "222";
//        System.out.println(p1.name);
//        System.out.println(p2.name);
        System.out.println(p1==p2);
//        ThreadTest t1 = new ThreadTest();
//        t1.start();
//        t1.setPersonName("Thread111");
//        ThreadTest t2 = new ThreadTest();
//        t2.start();
//        t2.setPersonName("Thread222");
//        System.out.println(Person3.getPerson().name);
    }
}
