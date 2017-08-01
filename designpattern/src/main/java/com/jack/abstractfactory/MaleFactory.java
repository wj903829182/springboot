package com.jack.abstractfactory;

/**
 * Created by jack on 2017/8/1.
 * 男性生产类
 */
public class MaleFactory implements HumanFactory{
    /**
     * 生产出黄人男性
     * @return
     */
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    /**
     * 生产出黑人男性
     * @return
     */
    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    /**
     * 生产出白人男性
     * @return
     */
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
