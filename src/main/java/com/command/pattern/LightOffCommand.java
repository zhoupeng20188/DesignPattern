package com.command.pattern;

/**
 * @Author zp
 * @create 2019/5/15 9:53
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.off();
    }

    public void undo() {
        this.light.on();
    }
}
