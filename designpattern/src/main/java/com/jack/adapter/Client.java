package com.jack.adapter;

/**
 * Created by jack on 2018/1/26.
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //源有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        //现在增加了适配器角色后的业务逻辑
        Target target1 = new Adapter();
        target1.request();
    }
}
