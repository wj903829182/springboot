package com.jack.interator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 2018/1/26.
 * 项目迭代器
 */
public class ProjectIterator implements IProjectIterator {
    //保存所有项目
    private List<IProject> projectList = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    /**
     * 判断是否还有元素，必须实现
     * @return
     */
    @Override
    public boolean hasNext() {
        boolean result = true;
        if (this.currentItem >= this.projectList.size() || this.projectList.get(this.currentItem) == null) {
            result = false;
        }
        return result;
    }

    /**
     * 取得下一个值
     * @return
     */
    @Override
    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }

    //删除对象，暂时不实现
    @Override
    public void remove() {

    }
}
