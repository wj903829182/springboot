package com.jack.component;

import java.util.List;

/**
 * Created by jack on 2018/1/26.
 * 抽象构件
 */
public abstract class Component {
    //个体和整体都具有的共享
    public void doSomething(){
        //编写业务逻辑
        System.out.println("abstract do something");
    }

    /**
     * 增加一个叶子构件或者树枝构件
     * @param component
     */
    public abstract void add(Component component);

    /**
     * 删除一个叶子构件或者树枝构件
     * @param component
     */
    public abstract void remove(Component component);

    /**
     * 获得分支下所有叶子构件和树枝构件
     * @return
     */
    public abstract List<Component> getChildren();


}
