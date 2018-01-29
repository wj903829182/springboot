package com.jack.memorandum;

import java.beans.IntrospectionException;
import java.beans.Introspector;

/**
 * Created by jack on 2018/1/29.
 */
public class Client {
    public static void main(String[] args) {
        //定义发起人
        Originator originator = new Originator();
        //定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        //创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        //恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());

    }
}
