package com.jack.strategy;

/**
 * Created by jack on 2017/8/15.
 * 乔国老开后门
 */
public class BackDoor implements IStrategy{
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
