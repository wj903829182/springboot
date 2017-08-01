package com.jack.singleton;

/**
 * Created by jack on 2017/8/1.
 * 单例模式,饿汗模式
 */
public class SingletonA {
    /**
     * 创建单例对象
     */
    private static SingletonA singletonA = new SingletonA();

    /**
     * 构造函数私有化，不能在类外面创建对象
     */
    private SingletonA() {
    }

    /**
     * 获取单例对象
     * @return
     */
    public static SingletonA getSingleton(){
        return singletonA;
    }
}
