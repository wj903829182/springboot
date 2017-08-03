package com.jack.buildermodel;

import java.util.ArrayList;

/**
 * Created by jack on 2017/8/3.
 * 建造者模式
 */
public abstract class CarModel {
    //这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<>();
    /**
     * 模型启动准备开始跑了
     */
    abstract void start();

    /**
     * 能发动还要能停下来
     */
    abstract void stop();

    /**
     * 喇叭会响，可以出什么声音根据车子来决定
     */
    abstract void alarm();

    /**
     * 引擎会响
     */
    abstract void engineBoom();

    /**
     * 车子会跑
     */
    public void run(){
        for (int i= 0;i< this.sequence.size();i++) {
            String actionName = this.sequence.get(i);
            if ("start".equals(actionName)){
                this.start();//启动汽车
            }else if ("stop".equals(actionName)){
                this.stop();//停止汽车
            }else if ("alarm".equals(actionName)){
                this.alarm();//喇叭开始响了
            } else if ("enginboom".equals(actionName)) {
                this.engineBoom();//引擎开始响了
            }
        }
    }

    //把传递过来的值传递到类内
    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
