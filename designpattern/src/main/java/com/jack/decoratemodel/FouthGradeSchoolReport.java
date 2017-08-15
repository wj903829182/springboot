package com.jack.decoratemodel;

/**
 * Created by jack on 2017/8/7.
 * 四年级成绩单
 */
public class FouthGradeSchoolReport extends  SchoolReport{
    /**
     * 成绩单
     */
    @Override
    public void report() {
        //成绩单的输出格式
        System.out.println("尊敬的xx家长：");
        System.out.println(".........................");
        System.out.println("语文：59，数学：49，体育：60，英语48");
        System.out.println("                     家长签名：          ");
    }

    /**
     * 家长签名
     */
    @Override
    public void sign(String name) {
        System.out.println("家长签名为："+name);
    }
}
