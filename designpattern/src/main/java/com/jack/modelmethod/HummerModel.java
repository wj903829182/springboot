package com.jack.modelmethod;

/**
 * Created by jack on 2017/8/2.
 * 模版方法模式
 */
public abstract class HummerModel {
    /**
     * 悍马发动起来
     */
    abstract void start();

    /**
     * 能发动还要能停下来
     */
    abstract void stop();

    /**
     * 喇叭会响
     */
    abstract void alarm();

    /**
     * 引擎会响
     */
    abstract void engineBoom();

    public void run(){
        //先发动汽车
        this.start();
        //汽车引擎开始响
        this.engineBoom();
        //按喇叭
        this.alarm();
        //到达目的地就停车
        this.stop();
    }
}
