package com.state.pattern;

/**
 * @Author zp
 * @create 2019/6/6 9:46
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("please wait, we'are already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("sorry, you have turned the crank");
    }

    public void turnCrank() {
        System.out.println("sorry, you have turned the crank");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.count != 0){
            gumballMachine.setState(gumballMachine.noQuarterState);
        } else {
            System.out.println("out of gumballs!!");
            gumballMachine.setState(gumballMachine.soldOutState);
        }
    }
}
