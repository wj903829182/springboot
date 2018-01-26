package com.jack.component;

/**
 * Created by jack on 2018/1/26.
 */
public class Leaf extends Component {
    @Override
    public void doSomething() {
        //覆盖写父类的方法
        System.out.println("this is leaf ");
    }
}
