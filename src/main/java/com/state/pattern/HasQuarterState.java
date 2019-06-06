package com.state.pattern;

import java.util.Random;

/**
 * @Author zp
 * @create 2019/6/6 9:46
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("you can't insert another quarter !!!");
    }

    public void ejectQuarter() {
        System.out.println("you eject a quarter");
        gumballMachine.setState(gumballMachine.noQuarterState);
    }

    public void turnCrank() {
        System.out.println("you turned..");
//        Random random = new Random(System.currentTimeMillis());
        Random random = new Random();
        int winner = random.nextInt(10);
        System.out.println("the random is " + winner);
        if (winner == 1 && gumballMachine.count > 1) {
            gumballMachine.setState(gumballMachine.winnerState);
        } else {
            gumballMachine.setState(gumballMachine.soldState);
        }
    }

    public void dispense() {
        System.out.println("you need to turnCrank first");
    }
}
