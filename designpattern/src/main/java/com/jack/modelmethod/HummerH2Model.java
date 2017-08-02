package com.jack.modelmethod;

/**
 * Created by jack on 2017/8/2.
 */
public class HummerH2Model extends HummerModel{
    @Override
    void start() {
        System.out.println("悍马H2发动.....");
    }

    @Override
    void stop() {
        System.out.println("悍马H2停车.....");
    }

    @Override
    void alarm() {
        System.out.println("悍马H2按喇叭.....");
    }

    @Override
    void engineBoom() {
        System.out.println("悍马H2的引擎声.....");
    }
}
