package com.jack.factory;

/**
 * Created by jack on 2017/8/1.
 * 黑色人种
 */
public class BlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，反正不是说黑话");
    }
}
