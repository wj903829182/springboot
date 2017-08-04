package com.jack.prototype;

/**
 * Created by jack on 2017/8/3.
 * 邮件类
 */
public class Mail implements Cloneable{
    /**
     * 收件人
     */
    private String receiver;
    /**
     * 邮件名称
     */
    private String subject;
    /**
     * 称谓
     */
    private String appellation;
    /**
     * 邮件内容
     */
    private String context;
    /**
     * 邮件尾部
     */
    private String tail;

    /**
     * 构造函数
     * @param advTemplate
     */
    public Mail(AdvTemplate advTemplate){
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    protected Mail clone() throws CloneNotSupportedException {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }

        return mail;
    }
}
