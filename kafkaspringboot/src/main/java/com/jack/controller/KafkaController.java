package com.jack.controller;

import com.jack.producer.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jack on 2017/9/7.
 */
@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    KafkaSender kafkaSender;
    @RequestMapping(value = "/kafkatest")
    public String kafkaTest(){
        kafkaSender.sendMessage("我是kafka生产者发送的消息");
        return "kafka发送消息成功";
    }

}
