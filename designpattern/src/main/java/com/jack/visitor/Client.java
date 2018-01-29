package com.jack.visitor;

/**
 * Created by jack on 2018/1/29.
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //获得元素
            Element element = ObjectStruture.createElement();
            element.accept(new Visitor());
        }
    }
}
