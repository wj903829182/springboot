package com.jack.modelmethod;

/**
 * Created by jack on 2017/8/2.
 */
public class HummerH1Model extends HummerModel{
    @Override
    void start() {
        System.out.println("悍马H1发动.....");
    }

    @Override
    void stop() {
        System.out.println("悍马H1停车.....");
    }

    @Override
    void alarm() {
        System.out.println("悍马H1按喇叭.....");
    }

    @Override
    void engineBoom() {
        System.out.println("悍马H1的引擎声.....");
    }
}
