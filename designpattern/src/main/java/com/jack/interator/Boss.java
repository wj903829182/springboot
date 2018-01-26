package com.jack.interator;

/**
 * Created by jack on 2018/1/26.
 */
public class Boss {
    public static void main(String[] args) {
        //定义一个项目对象，里面有一个list存放所有的项目
        IProject project = new Project();
        project.add("星球大战项目",10,1000000);
        project.add("人月神话项目",100,10000000);
        project.add("超人改造项目",20,88998989);
        //循环添加项目
        for (int i=4;i<104;i++) {
            project.add("第"+i+"个项目",i*5,i*1000);
        }
        //遍历list,取出所有数据
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject project1 = (IProject) projectIterator.next();
            System.out.println(project1.getProjectInfo());
        }
    }
}
