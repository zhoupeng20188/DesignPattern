package com.state.pattern;

/**
 * @Author zp
 * @create 2019/6/6 9:46
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("you insert a quarter");
        gumballMachine.setState(gumballMachine.hasQuarterState);
    }

    public void ejectQuarter() {
        System.out.println("you haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("you turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("you need to pay first");
    }
}
