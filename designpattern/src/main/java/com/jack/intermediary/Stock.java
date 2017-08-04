package com.jack.intermediary;

/**
 * Created by jack on 2017/8/4.
 * 库存管理
 */
public class Stock extends AbstractColleague{
    //初始化电脑100台
    private static int COMPUTER_NUMBER = 100;
    public Stock(AbstractMediator abstractMediatorParam) {
        super(abstractMediatorParam);
    }

    /**
     * 库存增加
     * @param number
     */
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER +number;
        System.out.println("increase库存数量为: "+COMPUTER_NUMBER);
    }

    /**
     * 库存数量为
     * @param number
     */
    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("decrease库存数据量为： "+COMPUTER_NUMBER);
    }

    /**
     * 获得库存数量
     * @return
     */
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    /**
     * 库存压力大，就要通知采购人员不要采购，销售人员尽快销售
     */
    public void clearStock(){
        System.out.println("清理存货数量为："+COMPUTER_NUMBER);
        super.abstractMediator.execute("stock.clear");
    }

}
