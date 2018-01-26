package com.jack.component;

import java.util.List;

/**
 * Created by jack on 2018/1/26.
 */
public class Leaf extends Component {
    @Override
    public void doSomething() {
        //覆盖写父类的方法
        System.out.println("this is leaf ");
    }

    @Override
    public void add(Component component) throws UnsupportedOperationException{
        //空实现
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component)throws UnsupportedOperationException {
        //空实现
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Component> getChildren() throws UnsupportedOperationException{
        //空实现
        throw new UnsupportedOperationException();
        //return null;
    }
}
