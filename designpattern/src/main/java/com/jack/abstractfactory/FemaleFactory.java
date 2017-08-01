package com.jack.abstractfactory;

/**
 * Created by jack on 2017/8/1.
 * 女性工厂类
 */
public class FemaleFactory implements HumanFactory{
    /**
     * 生产出黄人女性
     * @return
     */
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    /**
     * 生产出黑人女性
     * @return
     */
    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    /**
     * 生产出白人女性
     * @return
     */
    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
