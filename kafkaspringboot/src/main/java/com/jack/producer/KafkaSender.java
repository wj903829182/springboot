package com.jack.producer;

import com.jack.interf.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by jack on 2017/9/7.
 * 生产者代码，调用sendMessage方法发送消息
 * 参考资料：http://blog.csdn.net/ldy1016/article/details/72852179
 */
@EnableBinding(Source.class)
public class KafkaSender {
    @Autowired
    private Source source;

    public void sendMessage(String message) {
        try {
            source.output1().send(MessageBuilder.withPayload("message: " + message).build());
        } catch (Exception e) {
            //logger.info("消息发送失败，原因："+e);
            System.out.println("消息发送失败，原因："+e);
            e.printStackTrace();
        }
    }
}
