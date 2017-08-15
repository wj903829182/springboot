package com.jack.strategy;

/**
 * Created by jack on 2017/8/15.
 * 孙夫人断后
 */
public class BlockEnemy implements IStrategy{
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
