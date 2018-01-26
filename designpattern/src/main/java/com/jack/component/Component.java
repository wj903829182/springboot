package com.jack.component;

/**
 * Created by jack on 2018/1/26.
 * 抽象构件
 */
public abstract class Component {
    //个体和整体都具有的共享
    public void doSomething(){
        //编写业务逻辑
        System.out.println("abstract do something");
    }
}
