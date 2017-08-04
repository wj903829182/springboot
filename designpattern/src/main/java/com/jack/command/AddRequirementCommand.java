package com.jack.command;

/**
 * Created by jack on 2017/8/4.
 * 增加需求命令
 */
public class AddRequirementCommand extends Command{
    /**
     * 执行增加一项需求的命令
     */
    @Override
    public void execute() {
        //找到需求组
        super.rg.find();
        //增加一份需求
        super.rg.add();
        //给出计划
        super.rg.plan();
    }
}
