package com.jack.factory;

/**
 * Created by jack on 2017/8/1.
 */
public class SingletonC {
    //不允许在类外部通过new产生对象
    private SingletonC() {
    }
    public void doSomething(){
        // to do something
        System.out.println("在这里做些什么吧!");
    }
}
