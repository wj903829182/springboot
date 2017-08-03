package com.jack.buildermodel;

/**
 * Created by jack on 2017/8/3.
 */
public class MainTest3 {
    public static void main(String[] args) {
        Director director = new Director();
        //100辆A类型的车
        for (int i= 0 ;i<100;i++){
            director.getABenzModel();
        }
        //100辆B类型的车
        for (int i= 0 ;i<100;i++){
            director.getBBenzModel();
        }
        //100辆C类型的车
        for (int i= 0 ;i<100;i++){
            director.getCBWMModel();
        }
    }
}
