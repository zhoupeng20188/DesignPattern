package com.command.pattern;

/**
 * @Author zp
 * @create 2019/5/15 9:53
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    /**
     * 构造器中初始化为空的command
     */
    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("--------------------remote control--------------\n");
        for (int i = 0; i < 7; i++) {
            stringBuffer.append("[slot " + i + " ]" + onCommands[i].getClass().getName() + "           " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
