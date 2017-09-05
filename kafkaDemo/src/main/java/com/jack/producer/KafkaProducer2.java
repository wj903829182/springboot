package com.jack.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * Created by jack on 2017/9/5.
 * 使用java客户端的生产者，新的api
 * 参考：http://orchome.com/303
 *
 kafka客户端发布record(消息)到kafka集群
 */
public class KafkaProducer2 {

    /**
     * 生产者
     */
    private final Producer<String, String> producer;
    public final static String TOPIC = "JACK";

    /**
     * 构造函数
     */
    public KafkaProducer2() {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        producer = new KafkaProducer<>(props);
    }

    public void productMessage() {
        for (int i = 0; i < 10000; i++) {
            producer.send(new ProducerRecord<String, String>(TOPIC, Integer.toString(i), Integer.toString(i)));
            System.out.println("the send data is:key ="+i+"  value = "+i);
        }
        producer.flush();
    }

    public static void main(String[] args) {
        new KafkaProducer2().productMessage();
    }
}
