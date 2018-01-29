package com.jack.memorandum;

/**
 * Created by jack on 2018/1/29.
 * 备忘录角色
 */
public class Memento {
    //发起人的内部状态
    private String state = "";

    /**
     * 构造函数传递入参
     * @param state
     */
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
