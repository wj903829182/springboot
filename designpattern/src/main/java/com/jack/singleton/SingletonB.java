package com.jack.singleton;

/**
 * Created by jack on 2017/8/1.
 * 单例，懒汉模式
 */
public class SingletonB {
    private static SingletonB singletonB = null;

    private SingletonB() {
    }

    public static SingletonB getSingletonB() {
        if (singletonB == null) {
            synchronized (SingletonB.class) {
                if (singletonB == null) {
                    singletonB = new SingletonB();
                }
            }
        }
        return singletonB;
    }
}
