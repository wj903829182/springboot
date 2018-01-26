package com.jack.adapter;

/**
 * Created by jack on 2018/1/26.
 * 目标角色的实现类
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need any help ,please call me.");
    }
}
