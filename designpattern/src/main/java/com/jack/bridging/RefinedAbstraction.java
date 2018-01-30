package com.jack.bridging;

/**
 * Created by jack on 2018/1/30.
 * 具体抽象化角色
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor _imp) {
        super(_imp);
    }

    /**
     * 修正父类的行为
     */
    @Override
    public void request() {
        //业务处理 ...
        super.request();
        super.getImp().doAnything();
    }
}
