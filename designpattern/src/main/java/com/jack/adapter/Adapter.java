package com.jack.adapter;

/**
 * Created by jack on 2018/1/26.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
