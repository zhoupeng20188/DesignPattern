package com.state.pattern;

/**
 * @Author zp
 * @create 2019/6/6 10:37
 */
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(100);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        for (int i = 0; i < 10; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }
    }
}
