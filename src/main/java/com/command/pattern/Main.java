package com.command.pattern;

/**
 * @Author zp
 * @create 2019/5/23 15:13
 */
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        System.out.println("------------------------------------");
        LightControl lightControl = new LightControl();
        LightMode1Command lightMode1Command = new LightMode1Command(light);
        LightMode2Command lightMode2Command = new LightMode2Command(light);
        lightControl.setCommand(lightMode1Command,lightOffCommand);
        lightControl.onButtonWasPushed();
        lightControl.setCommand(lightMode2Command,lightOffCommand);
        lightControl.onButtonWasPushed();
        lightControl.undoButtonWasPushed();
    }
}
