package com.jack.buildermodel;

/**
 * Created by jack on 2017/8/3.
 * 奔驰模型
 */
public class BenzModel extends CarModel {
    @Override
    void start() {
        System.out.println("奔驰跑起来");
    }

    @Override
    void stop() {
        System.out.println("奔驰停车");
    }

    @Override
    void alarm() {
        System.out.println("奔驰按喇叭");
    }

    @Override
    void engineBoom() {
        System.out.println("奔驰引擎响起来");
    }
}
