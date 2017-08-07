package com.jack.responsibilitychain;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by jack on 2017/8/7.
 */
public class MainTest7 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //随机挑选几个女性
        Random random = new Random();
        ArrayList<IWomen> womenList = new ArrayList<>();
        for (int i=0;i<5;i++){
            womenList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }
        //定义三个请示对象
        Father father = new Father();
        Husband husband = new Husband();
        Son son = new Son();
        //设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women: womenList) {
            father.HandleMessage(women);
        }
    }

}
