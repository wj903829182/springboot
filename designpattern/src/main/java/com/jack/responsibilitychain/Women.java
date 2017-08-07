package com.jack.responsibilitychain;

/**
 * Created by jack on 2017/8/7.
 * 女性类
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
     * 构造函数传递过来请求
     * @param type
     * @param request
     */
    public Women(int type, String request) {
        this.type = type;
        switch (this.type){
            case 1:
                this.request = "女儿的请求是："+request;
                break;
            case 2:
                this.request = "妻子的请求是："+request;
                break;
            case 3:
                this.request = "母亲的请求是："+request;
                break;
        }
    }

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
