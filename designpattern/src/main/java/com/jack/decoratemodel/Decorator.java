package com.jack.decoratemodel;

/**
 * Created by jack on 2017/8/15.
 * 修饰的抽象类
 */
public abstract class Decorator extends SchoolReport{
    /**
     * 成绩单
     */
    private SchoolReport sr;



    /**
     * 构造函数传递成绩单过来
     * @param sr
     */
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    /**
     * 成绩单还是需要看的
     */
    @Override
    public void report() {
        this.sr.report();
    }
    /**
     * 成绩单看完还是需要签名的
     * @param name
     */
    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
