package com.jack.enjoy;

/**
 * Created by jack on 2018/1/30.
 * 具体享元角色
 */
public class ConcreteFlyweight2 extends Flyweight{
    // 接受外部状态
    public ConcreteFlyweight2(String _Extrinsic){
        super(_Extrinsic);
    }

    /**
     * 根据外部状态进行逻辑处理
     */
    @Override
    public void operate() {
        //业务处理逻辑
    }
}
