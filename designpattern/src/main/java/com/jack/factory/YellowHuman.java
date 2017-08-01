package com.jack.factory;

/**
 * Created by jack on 2017/8/1.
 * 黄色人种
 */
public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("中国人是黄色人种，皮肤是黄色的，称黄种人");
    }

    @Override
    public void talk() {
        System.out.println("黄种人的通用语言是普通话，我们一起来说普通话");
    }
}
