package com.jack.prototype;

import java.util.Random;

/**
 * Created by jack on 2017/8/3.
 */
public class MainTest4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int maxCount = 8;
        int i = 0;
        //把模板定义出来
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("招商银行版权所有");
        while (i < maxCount) {
            //使用克隆，原型模式
            Mail cloneMail = mail.clone();
            //下面时每个邮件不同的地方
            cloneMail.setAppellation(getRandString(5)+"先生（女生）");
            cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8));
            //发送邮件
            sendMail(cloneMail);
            i++;
        }
    }

    /**
     * 发送邮件
     * @param mail
     */
    public static void sendMail(Mail mail){
        System.out.println("标题:"+mail.getSubject()+"\t收件人："+mail.getReceiver()+"\t....发送成功！！！");
    }

    /**
     * 获得指定长度的随机字符串
     * @param maxLength
     * @return
     */
    public static String getRandString(int maxLength){
        String source = "abcdefghijklmnopqrstuvwxyz";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0 ;i < maxLength;i++){
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }

}
