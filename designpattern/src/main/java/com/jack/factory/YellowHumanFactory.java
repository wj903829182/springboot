package com.jack.factory;

/**
 * Created by jack on 2017/8/1.
 * 生产黄种人的工厂
 */
public class YellowHumanFactory extends AbstractHumanFactoryB{
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
