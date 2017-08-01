package com.jack.abstractfactory;

/**
 * Created by jack on 2017/8/1.
 * 黄色人种抽象类
 */
public abstract class AbstractYellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种都说普通话");
    }

}
