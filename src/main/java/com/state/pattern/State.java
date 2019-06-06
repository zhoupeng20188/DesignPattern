package com.state.pattern;

/**
 * @Author zp
 * @create 2019/6/6 9:45
 */
public interface State {
    // 投入硬币
    public void insertQuarter();
    // 退出硬币
    public void ejectQuarter();
    // 转动摇杆
    public void turnCrank();
    // 出球
    public void dispense();
}
