package com.jack.observer;

import java.util.Vector;

/**
 * Created by jack on 2018/1/26.
 * 被观察者
 */
public abstract class Subject {
    //定义一个观察者数组
    private Vector<Observer> observerVector = new Vector<>();

    /**
     * 增加一个观察者
     * @param observer
     */
    public void addObserver(Observer observer){
        this.observerVector.add(observer);
    }

    /**
     * 删除一个观察者
     * @param observer
     */
    public void delObserver(Observer observer){
        this.observerVector.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyObservers(){
        for (Observer observer : observerVector) {
            observer.update();
        }
    }


}
