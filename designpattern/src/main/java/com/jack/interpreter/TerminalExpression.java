package com.jack.interpreter;

/**
 * Created by jack on 2018/1/30.
 *  终结符表达式
 */
public class TerminalExpression extends Expression{
    /**
     * 通常终结符表达式只有一个，但是有多个对象
     * @param ctx
     * @return
     */
    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}
