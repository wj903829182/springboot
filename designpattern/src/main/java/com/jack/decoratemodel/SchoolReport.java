package com.jack.decoratemodel;

/**
 * Created by jack on 2017/8/7.
 * 抽象类，学校成绩
 */
public abstract class SchoolReport {
    /**
     * 成绩单，主要展示的就是成绩情况
     */
    public abstract void report();

    /**
     * 成绩单要家长签名
     */
    public abstract void sign();
}
