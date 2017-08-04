package com.jack.command;

/**
 * Created by jack on 2017/8/4.
 * 负责人
 */
public class Invoker {
    //定义命令对象，执行什么命令
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行客户的命令
     */
    public void action(){
        this.command.execute();
    }
}
