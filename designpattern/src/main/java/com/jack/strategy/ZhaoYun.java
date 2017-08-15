package com.jack.strategy;

/**
 * Created by jack on 2017/8/15.
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        //刚刚到吴国的时候拆第一个
        System.out.println("--刚刚到吴国的时候拆第一个--");
        context = new Context(new BackDoor());//拿到妙计
        context.operate();//拆开执行
        //刘备乐不思蜀，拆开第二个
        System.out.println("刘备乐不思蜀，拆开第二个");
        context = new Context(new GivenGreenLight());
        context.operate();//执行第二个锦囊
        //孙权追兵来了，拆开第三个
        System.out.println("--孙权追兵来了，拆开第三个--");
        context = new Context(new BlockEnemy());
        context.operate();//孙夫人退兵
        System.out.println("\n\n\n\n");
    }
}
