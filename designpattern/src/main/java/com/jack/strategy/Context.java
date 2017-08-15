package com.jack.strategy;

/**
 * Created by jack on 2017/8/15.
 * 锦囊
 */
public class Context {
    /**
     * 构造函数初始化，要使用哪个妙计
     */
    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    /**
     * 使用了锦囊，下面开始出招
     */
    public void operate(){
        this.iStrategy.operate();
    }
}
