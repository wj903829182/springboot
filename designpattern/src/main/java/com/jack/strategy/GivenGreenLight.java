package com.jack.strategy;

/**
 * Created by jack on 2017/8/15.
 * 吴国太开绿灯
 */
public class GivenGreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行！");
    }
}
