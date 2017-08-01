package com.jack.factory;

/**
 * Created by jack on 2017/8/1.
 * 简单工厂模式的工厂类
 */
public class HumanFactoryB {

   public static <T extends Human> T createHuman(Class<T> c) {
        //定义一个生产的人种
        Human human = null;
        try {
            //使用反射创建对象
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("工厂生产人种错误");
        }
        return (T) human;
    }
}
