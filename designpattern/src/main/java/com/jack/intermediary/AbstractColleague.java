package com.jack.intermediary;

/**
 * Created by jack on 2017/8/4.
 * 抽象同事类
 */
public abstract class AbstractColleague {
    protected AbstractMediator abstractMediator;
    public AbstractColleague(AbstractMediator abstractMediatorParam){
        this.abstractMediator = abstractMediatorParam;
    }
}
