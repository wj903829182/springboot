package com.jack.interpreter;

/**
 * Created by jack on 2018/1/30.
 */
public class NonterminalExpression extends Expression {

    /**
     *  每个非终结符表达式都会对其他表达式产生依赖
     * @param expressions
     */
    public NonterminalExpression(Expression... expressions) {
    }

    @Override
    public Object interpreter(Context ctx) {
        // 进行文法处理
        return null;
    }
}
