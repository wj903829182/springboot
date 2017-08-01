package com.jack.abstractfactory;

/**
 * Created by jack on 2017/8/1.
 * 黑色人种抽象类
 */
public abstract class AbstractBlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑色人种说黑话");
    }

}
