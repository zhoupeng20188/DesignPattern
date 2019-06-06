package com.state.pattern;

/**
 * @Author zp
 * @create 2019/6/6 9:46
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("sold out !!!");
    }

    public void ejectQuarter() {
        System.out.println("sold out !!!");
    }

    public void turnCrank() {
        System.out.println("sold out !!!");
    }

    public void dispense() {
        System.out.println("sold out !!!");
    }
}
