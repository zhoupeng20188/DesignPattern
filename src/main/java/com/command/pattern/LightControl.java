package com.command.pattern;

/**
 * @Author zp
 * @create 2019/5/15 9:53
 */
public class LightControl {
    private Command onCommand;
    private Command offCommand;
    private Command undoCommand;

    /**
     * 构造器中初始化为空的command
     */
    public LightControl() {

        Command noCommand = new NoCommand();
        onCommand = noCommand;
        offCommand = noCommand;
        undoCommand = noCommand;
    }

    public void setCommand(Command onCommand, Command offCommand){
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }
    public void onButtonWasPushed(){
        onCommand.execute();
        undoCommand = onCommand;
    }
    public void offButtonWasPushed(){
        offCommand.execute();
        undoCommand = offCommand;
    }


    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
