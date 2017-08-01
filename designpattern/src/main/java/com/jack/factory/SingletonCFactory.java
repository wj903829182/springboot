package com.jack.factory;

import java.lang.reflect.Constructor;

/**
 * Created by jack on 2017/8/1.
 */
public class SingletonCFactory {
    private static SingletonC singletonC;
    //静态代码块,初始化单例
    static{
        try {
            Class cl = Class.forName(SingletonC.class.getName());
            //获得无参构造
            Constructor constructor = cl.getDeclaredConstructor();
            //设置无参构造是可访问的
            constructor.setAccessible(true);
            //产生一个实例对象
            singletonC = (SingletonC) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取单例对象
    public static SingletonC getSingletonC() {

        return singletonC;
    }
}
