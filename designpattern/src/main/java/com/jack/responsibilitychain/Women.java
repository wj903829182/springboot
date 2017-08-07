package com.jack.responsibilitychain;

/**
 * Created by jack on 2017/8/7.
 * 妇女类
 */
public class Women implements IWomen{
    /**
     * 通过参数来描述妇女的个人状况
     * 1---未出嫁
     * 2---出嫁
     * 3---夫死
     */
    private int type;
    /**
     * 妇女的请示
     */
    private String request = "";

    /**
     * 获得妇女的个人状况
     * @return
     */
    @Override
    public int getType() {
        return this.type;
    }

    /**
     * 获得妇女的请求
     * @return
     */
    @Override
    public String getRequest() {
        return this.request;
    }
}
