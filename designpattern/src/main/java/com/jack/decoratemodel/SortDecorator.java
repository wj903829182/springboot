package com.jack.decoratemodel;

/**
 * Created by jack on 2017/8/15.
 * 排名情况修饰
 */
public class SortDecorator extends Decorator{
    /**
     * 构造函数传递成绩单过来
     *
     * @param sr
     */
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    /**
     * 告诉排名情况
     */
    private void reportSort(){
        System.out.println("我是排名22");
    }

    /**
     * 看完成绩后，告诉排名情况
     */
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
