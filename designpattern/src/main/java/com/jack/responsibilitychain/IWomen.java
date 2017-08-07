package com.jack.responsibilitychain;

/**
 * Created by jack on 2017/8/7.
 * 女性接口
 */
public interface IWomen {
    /**
     *获得个人状况,通过返回值确定结婚与否，丈夫是否去世
     * @return
     */
    public int getType();

    /**
     *获得个人请示，出去逛街还是吃饭
     * @return
     */
    public String getRequest();
}
