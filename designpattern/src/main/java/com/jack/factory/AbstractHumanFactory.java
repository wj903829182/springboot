package com.jack.factory;

/**
 * Created by jack on 2017/8/1.
 * 抽象工厂
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
