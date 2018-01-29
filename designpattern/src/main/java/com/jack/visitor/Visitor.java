package com.jack.visitor;

/**
 * Created by jack on 2018/1/29.
 * 具体范围者
 */
public class Visitor implements IVisitor {
    /**
     * 访问element1
     * @param element
     */
    @Override
    public void visit(ConcreteElement1 element) {
        element.doSomething();
    }

    /**
     * 访问element2
     * @param element
     */
    @Override
    public void visit(ConcreteElement2 element) {
        element.doSomething();
    }
}
