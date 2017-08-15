package com.jack.decoratemodel;

/**
 * Created by jack on 2017/8/15.
 * 最高成绩修饰
 */
public class HighScoreDecorator extends Decorator{
    /**
     * 构造函数传递成绩单过来
     *
     * @param sr
     */
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    /**
     * 汇报最高成绩
     */
    private void reportHighScore(){
        System.out.println("这次语文最高是75，数学是80，英语是70");
    }

    /**
     * 老爸看成绩之前，先看下最高成绩
     */
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
