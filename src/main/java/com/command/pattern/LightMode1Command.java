package com.command.pattern;

/**
 * @Author zp
 * @create 2019/5/23 15:50
 */
public class LightMode1Command implements Command {
    Light light;
    int preMode;

    public LightMode1Command(Light light) {
        this.light = light;
    }

    public void execute() {
        preMode = light.getMode();
        this.light.mode1();
    }

    public void undo() {
        if (preMode == 1) {
            this.light.mode1();
        } else {
            this.light.mode2();
        }
    }
}
