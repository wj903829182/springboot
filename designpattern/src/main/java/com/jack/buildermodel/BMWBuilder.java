package com.jack.buildermodel;

import java.util.ArrayList;

/**
 * Created by jack on 2017/8/3.
 * 宝马建造者
 */
public class BMWBuilder extends CarBuilder{
    private BMWModel bmwModel = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
