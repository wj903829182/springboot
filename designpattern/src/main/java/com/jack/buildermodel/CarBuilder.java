package com.jack.buildermodel;

import java.util.ArrayList;

/**
 * Created by jack on 2017/8/3.
 * 抽象类，建造者
 */
public abstract class CarBuilder {
    //建造一个模型，你需要给我一个顺序要求，就是车的动作
    public abstract void setSequence(ArrayList<String> sequence);
    //设置完毕顺序后，就可以直接拿到这个模型了
    public abstract CarModel getCarModel();
}
