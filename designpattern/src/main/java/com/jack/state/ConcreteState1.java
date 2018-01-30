package com.jack.state;

/**
 * Created by jack on 2018/1/30.
 * 环境角色
 */
public class ConcreteState1 extends State{
    @Override
    public void handle1() {
        //本状态下必须处理的逻辑
    }

    @Override
    public void handle2() {
        // 设置当前状态为 stat2
        super.context.setCurrentState(Context.STATE2);
        // 过渡到 state2 状态，由 Context 实现
        super.context.handle2();
    }
}
