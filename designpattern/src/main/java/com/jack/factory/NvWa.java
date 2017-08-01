package com.jack.factory;

/**
 * Created by jack on 2017/8/1.
 * 女蜗，使用工厂类生产人类
 */
public class NvWa {
    public static void main(String[] args) {
        //声明阴阳八卦炉
        AbstractHumanFactory abstractHumanFactory = new HumanFactory();
        //女蜗第一次造人，火候不足，于是造出了白种人
        System.out.println("造成的第一批人是白色人种");
        Human whiteHuman = abstractHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        //女蜗第二次造人，火候过了，于是造出了黑种人
        System.out.println("造成的第二批人是黑色人种");
        Human blackHuman = abstractHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        //女蜗第三次造人，火候刚刚好，于是造出了黄种人
        System.out.println("造成的第三批人是黄色人种");
        Human yellowHuman = abstractHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
