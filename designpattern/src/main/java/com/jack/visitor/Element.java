package com.jack.visitor;

/**
 * Created by jack on 2018/1/29.
 * 抽象元素
 */
public abstract class Element {
    //定义业务逻辑
    public abstract void doSomething();
    //允许谁来访问
    public abstract void accept(IVisitor visitor);
}
