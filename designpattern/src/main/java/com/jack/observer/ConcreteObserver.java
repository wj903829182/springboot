package com.jack.observer;

/**
 * Created by jack on 2018/1/26.
 */
public class ConcreteObserver implements Observer {
    /**
     * 实现更新方法
     */
    @Override
    public void update() {
        System.out.println("接收到消息并处理");
    }
}
