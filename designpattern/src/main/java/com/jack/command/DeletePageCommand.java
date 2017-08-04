package com.jack.command;

/**
 * Created by jack on 2017/8/4.
 * 删除页面的命令
 */
public class DeletePageCommand extends Command{
    /**
     * 执行一个删除页面的命令
     */
    @Override
    public void execute() {
        //找到页面组
        super.pg.find();
        //删除一个页面
        super.pg.delete();
        //给出计划
        super.pg.plan();
    }
}
