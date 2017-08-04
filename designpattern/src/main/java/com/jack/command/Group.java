package com.jack.command;

/**
 * Created by jack on 2017/8/4.
 * 抽象组
 */
public abstract class Group {
    //甲乙双方分开办公，如果需要和某个组讨论，需要先找到这个组
    public abstract void find();
    //被要求增加功能
    public abstract void add();
    //被要求删除功能
    public abstract void delete();
    //被要求修改功能
    public abstract void change();
    //别要求给出所有变更的计划
    public abstract void plan();
}
