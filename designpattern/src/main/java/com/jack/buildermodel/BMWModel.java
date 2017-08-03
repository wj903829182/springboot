package com.jack.buildermodel;

/**
 * Created by jack on 2017/8/3.
 * 宝马模型
 */
public class BMWModel extends CarModel {
    @Override
    void start() {
        System.out.println("宝马跑起来");
    }

    @Override
    void stop() {
        System.out.println("宝马停车");
    }

    @Override
    void alarm() {
        System.out.println("宝马按喇叭");
    }

    @Override
    void engineBoom() {
        System.out.println("宝马引擎响起来");
    }
}
