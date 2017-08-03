package com.jack.buildermodel;

import java.util.ArrayList;

/**
 * Created by jack on 2017/8/3.
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    //宝马建造者
    private BMWBuilder bmwBuilder = new BMWBuilder();
    //奔驰建造者
    private BenzBuilder benzBuilder = new BenzBuilder();

    /**
     * A类型车的奔驰模型，先start然后stop，其他没有
     * @return
     */
    public CarModel getABenzModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        //按顺序返回一个奔驰车
        benzBuilder.setSequence(sequence);
        return benzBuilder.getCarModel();
    }

    /**
     * B类型车的奔驰模型，先发动引擎，然后start,stop，其他没有
     * @return
     */
    public CarModel getBBenzModel(){
        this.sequence.clear();
        this.sequence.add("enginboom");
        this.sequence.add("start");
        this.sequence.add("stop");
        //按顺序返回一个奔驰车
        this.benzBuilder.setSequence(sequence);
        return this.benzBuilder.getCarModel();
    }
    /**
     * C类型车的宝马模型，先按喇叭，然后start,stop，其他没有
     * @return
     */
    public CarModel getCBWMModel(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        //按顺序返回一个奔驰车
        this.bmwBuilder.setSequence(sequence);
        return this.bmwBuilder.getCarModel();
    }

    /**
     * D类型车的宝马模型，就一个功能，就是跑
     * @return
     */
    public CarModel getDBWMModel(){
        this.sequence.clear();
        this.sequence.add("start");
        //按顺序返回一个奔驰车
        this.bmwBuilder.setSequence(sequence);
        return this.bmwBuilder.getCarModel();
    }
    //还可以有很多车型

}
