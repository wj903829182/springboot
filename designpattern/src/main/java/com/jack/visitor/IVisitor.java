package com.jack.visitor;

/**
 * Created by jack on 2018/1/29.
 * 抽象访问者
 */
public interface IVisitor {
    void visit(ConcreteElement1 element);
    void visit(ConcreteElement2 element);
}
