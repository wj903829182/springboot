package com.jack.prototype;

/**
 * Created by jack on 2017/8/3.
 * 广告信模板
 */
public class AdvTemplate {
    //广告信名称
    private String advSubject = "招商银行信用卡活动";
    //广告信内容
    private String advContext = "将举行国庆抽奖活动，消费满100，送10000000积分";

    public String getAdvSubject() {
        return advSubject;
    }

    public void setAdvSubject(String advSubject) {
        this.advSubject = advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }

    public void setAdvContext(String advContext) {
        this.advContext = advContext;
    }
}
