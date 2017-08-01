package com.jack.abstractfactory;

/**
 * Created by jack on 2017/8/1.
 * 白色人种抽象类
 */
public abstract class AbstractWhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白色人种一般说英语");
    }

}
