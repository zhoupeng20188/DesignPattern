package com.state.pattern;

/**
 * @Author zp
 * @create 2019/6/6 10:28
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("you can't do this !!!");
    }

    public void ejectQuarter() {
        System.out.println("you can't do this !!!");
    }

    public void turnCrank() {
        System.out.println("you can't do this !!!");
    }

    public void dispense() {
        System.out.println("you are a winner !!");
        if (gumballMachine.count > 0) {
            gumballMachine.releaseBall();
            if (gumballMachine.count > 0) {
                gumballMachine.releaseBall();
            } else {
                System.out.println("out of balls!!");
                gumballMachine.setState(gumballMachine.soldOutState);
            }
        } else {
            System.out.println("out of balls!!");
            gumballMachine.setState(gumballMachine.soldOutState);
        }
        gumballMachine.setState(gumballMachine.noQuarterState);
    }
}
