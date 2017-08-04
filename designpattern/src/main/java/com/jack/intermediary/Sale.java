package com.jack.intermediary;

import java.util.Random;

/**
 * Created by jack on 2017/8/4.
 * 销售管理
 */
public class Sale extends AbstractColleague{
    public Sale(AbstractMediator abstractMediatorParam) {
        super(abstractMediatorParam);
    }

    /**
     * 销售IBM电脑
     */
    public void sellIBMComputer(int number){
        super.abstractMediator.execute("sale.sell",number);
        System.out.println("销售IBM电脑： "+number+"台");
    }

    /**
     * 反馈销售情况，0-100变化
     * @return
     */
    public int getSaleStatus(){
        Random random = new Random();
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为： " +saleStatus);
        return saleStatus;
    }

    /**
     * 折价处理
     */
    public void offSale(){
        super.abstractMediator.execute("sale.offsell");
    }


}
