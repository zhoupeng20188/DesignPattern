package com.command.pattern;

/**
 * @Author zp
 * @create 2019/5/15 9:53
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.on();
        this.light.mode1();
    }

    public void undo() {
        this.light.off();
    }
}
