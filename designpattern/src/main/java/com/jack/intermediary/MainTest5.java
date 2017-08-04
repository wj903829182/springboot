package com.jack.intermediary;

/**
 * Created by jack on 2017/8/4.
 */
public class MainTest5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        AbstractMediator abstractMediator = new Mediator();
        //采购人员采购电脑
        System.out.println("--------采购人员采购电脑------------");
        Purchase purchase = new Purchase(abstractMediator);
        purchase.buyIBMComputer(100);
        //销售人员销售电脑
        System.out.println("\n----------销售人员销售电脑--------------");
        Sale sale = new Sale(abstractMediator);
        sale.sellIBMComputer(1);
        //库房管理人员管理库存
        System.out.println("\n-----------------库房管理人员清库存管理----------------------");
        Stock stock = new Stock(abstractMediator);
        stock.clearStock();
    }

}
