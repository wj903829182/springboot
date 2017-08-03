package com.jack.buildermodel;

import java.util.ArrayList;

/**
 * Created by jack on 2017/8/3.
 */
public class MainTest2 {
    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList();
        sequence.add("enginboom");
        sequence.add("start");
        sequence.add("stop");
        sequence.add("enginboom");
        //要一个奔驰
        BenzBuilder benzBuilder = new BenzBuilder();
        //设置顺序
        benzBuilder.setSequence(sequence);
        //制造一个奔驰出来
        CarModel benz = benzBuilder.getCarModel();
        benz.run();

        System.out.println("--------------------");

        //要一个通用顺序的宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        CarModel bmw = bmwBuilder.getCarModel();
        bmw.run();
    }
}
