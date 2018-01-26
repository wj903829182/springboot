package com.jack.interator;

/**
 * Created by jack on 2018/1/26.
 * 项目信息接口
 */
public interface IProject {
    //增加项目
    void add(String name,int num,int cost);
    //获取项目信息
    String getProjectInfo();
    //获得一个可以遍历的对象
    IProjectIterator iterator();
}
