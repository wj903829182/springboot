package com.jack.abstractfactory;

/**
 * Created by jack on 2017/8/1.
 */
public class NvWaB {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();
        //生产线建立完成，开始进行生产
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("生产一个黄色女性 : ");
        femaleYellowHuman.getSex();
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        System.out.println("\n生产一个黄色男性 : ");
        maleYellowHuman.getSex();
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
    }
}
