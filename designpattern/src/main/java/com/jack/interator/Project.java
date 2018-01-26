package com.jack.interator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 2018/1/26.
 */
public class Project implements IProject {
    //定义一个项目列表，所有的项目都放在这里
    private List<IProject> projectList = new ArrayList<>();
    //项目名
    private String name = "";
    //项目成员数量
    private int num = 0;
    //项目费用
    private int cost = 0;

    public Project() {
    }

    /**
     * 定义一个构造函数，把所有需要看的信息存储起来
     * @param name
     * @param num
     * @param cost
     */
    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    /**
     * 增加项目
     * @param name
     * @param num
     * @param cost
     */
    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    /**
     * 得到项目信息
     * @return
     */
    @Override
    public String getProjectInfo() {
        String info = "";
        info = info+"项目名称："+this.name;
        info = info+"\t项目人数："+this.num;
        info = info+"\t项目费用："+this.cost;
        return info;
    }

    /**
     * 产生一个遍历对象
     * @return
     */
    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
