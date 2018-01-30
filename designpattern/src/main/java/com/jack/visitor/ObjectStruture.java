package com.jack.visitor;

import java.util.Random;

/**
 * Created by jack on 2018/1/29.
 * 结构对象
 */
public class ObjectStruture {

    /**
     * 对象生成器，这里通过一个工厂方法模式模拟
     * @return
     */
    public static Element createElement() {
        Random random = new Random();
        if (random.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}
