package com.jack.component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 2018/1/26.
 */
public class Composite extends Component {
    //构建容器
    private List<Component> componentList = new ArrayList<>();

    /**
     * 增加一个叶子构件或者树枝构件
     * @param component
     */
    public void add(Component component) {
        this.componentList.add(component);
    }

    /**
     * 删除一个叶子构件或者树枝构件
     * @param component
     */
    public void remove(Component component){
        this.componentList.remove(component);
    }

    /**
     * 获得分支下所有叶子构件和树枝构件
     * @return
     */
    public List<Component> getChildren(){
        return this.componentList;
    }

}
