package com.jack.component;

/**
 * Created by jack on 2018/1/26.
 */
public class Client {
    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        //创建一个树枝构件
        Composite branch = new Composite();
        //创建一个叶子节点
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
        display(root);
    }

    public static void display(Component root) {
        for (Component component : root.getChildren()) {
            if (component instanceof Leaf) {//叶子节点
                component.doSomething();
            } else {
                //树枝节点
                //display((Composite) component);
                display(component);

            }
        }
    }

}
