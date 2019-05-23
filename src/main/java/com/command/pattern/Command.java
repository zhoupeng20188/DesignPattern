package com.command.pattern;

/**
 * @Author zp
 * @create 2019/5/15 9:53
 */
public interface Command {
    public void execute();
    public void undo();
}
