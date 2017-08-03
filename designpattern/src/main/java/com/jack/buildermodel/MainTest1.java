package com.jack.buildermodel;

import java.util.ArrayList;

/**
 * Created by jack on 2017/8/3.
 */
public class MainTest1 {
    public static void main(String[] args) {
        CarModel carModel = new BenzModel();
        //存放汽车的顺序动作
        ArrayList<String> sequence = new ArrayList();
        sequence.add("enginboom");
        sequence.add("start");
        sequence.add("stop");
        sequence.add("enginboom");
        //把动作赋予奔驰
        carModel.setSequence(sequence);
        carModel.run();
    }
}
