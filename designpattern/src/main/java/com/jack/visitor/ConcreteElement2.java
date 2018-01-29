package com.jack.visitor;

/**
 * Created by jack on 2018/1/29.
 * 具体元素
 */
public class ConcreteElement2 extends Element {
    /**
     * 完善业务逻辑
     */
    @Override
    public void doSomething() {
        //业务逻辑处理
    }

    /**
     *允许哪个访问者访问
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
