package com.jack.factory;

/**
 * Created by jack on 2017/8/1.
 * 白色人种
 */
public class WhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般说英语");
    }
}
