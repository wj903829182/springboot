package com.jack.command;

/**
 * Created by jack on 2017/8/4.
 */
public class MainTest6 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //定义接头人
        Invoker ls = new Invoker();
        //客户要求增加一项需求
        System.out.println("------------客户要求增加一项需求---------------");
        //客户给我们下命令来
        Command command = new AddRequirementCommand();
        //接头人接收到命令
        ls.setCommand(command);
        //接头人执行命令
        ls.action();
    }

}
