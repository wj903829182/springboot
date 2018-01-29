package com.jack.observer;

/**
 * Created by jack on 2018/1/26.
 * 具体被观察者
 */
public class ConcreteSubject extends Subject {
    /**
     * 具体的业务
     */
    public void doSomething(){
        //
        super.notifyObservers();
    }
}
