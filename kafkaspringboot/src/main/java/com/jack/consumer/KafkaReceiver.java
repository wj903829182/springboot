package com.jack.consumer;

import com.jack.interf.Sink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * Created by jack on 2017/9/7.
 * 消费者端代码,通过receive方法接收消息
 */
@EnableBinding(Sink.class)
public class KafkaReceiver {
    @StreamListener(Sink.INPUT_1)
    private void receive(String vote) {
        //logger.info("receive message : " + vote);
        System.out.println("我是kafka消费者,receive message : " + vote);
    }
}
