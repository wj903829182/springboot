package com.jack.abstractfactory;

/**
 * Created by jack on 2017/8/1.
 * 人类生产接口类
 */
public interface HumanFactory {
    //制造黄色人种
    Human createYellowHuman();
    //制造黑色人种
    Human createBlackHuman();
    //制造白色人种
    Human createWhiteHuman();
}
