package com.jack.intermediary;

/**
 * Created by jack on 2017/8/4.
 * 采购管理
 */
public class Purchase extends AbstractColleague{
    public Purchase(AbstractMediator abstractMediatorParam) {
        super(abstractMediatorParam);
    }

    /**
     * 采购IBM电脑
     * @param number
     */
    public void buyIBMComputer(int number){
        super.abstractMediator.execute("purchase.buy",number);
    }

    /**
     * 不在采购IBM电脑
     */
    public void refuseBuyIBM(){
        System.out.println("不再采购IMB电脑");
    }
}
