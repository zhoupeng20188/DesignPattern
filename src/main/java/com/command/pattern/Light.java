package com.command.pattern;

/**
 * @Author zp
 * @create 2019/5/15 9:51
 */
public class Light {
    private static int MODE_1 = 1;
    private static int MODE_2 = 2;
    private int mode;

    public void on() {
        System.out.println("the light is on");
    }

    public void off() {
        System.out.println("the light is off");
    }

    public void mode1() {
        mode = MODE_1;
        System.out.println("the light is on mode1");
    }

    public void mode2() {
        mode = MODE_2;
        System.out.println("the light is on mode2");
    }
    public int getMode(){
        return this.mode;
    }
}
