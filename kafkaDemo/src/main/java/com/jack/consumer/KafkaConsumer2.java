package com.jack.consumer;

import com.alibaba.fastjson.JSONObject;
import com.jack.producer.KafkaProducer2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Arrays;
import java.util.Properties;

/**
 * Created by jack on 2017/9/5.
 * 参考资料：http://orchome.com/451
 * kafka消费者客户端
 */
public class KafkaConsumer2 {
    private final KafkaConsumer<String, String> consumer;

    public KafkaConsumer2() {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("group.id", "test");
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        consumer = new KafkaConsumer<>(props);
        // consumer.subscribe(Arrays.asList("foo", "bar"));
    }

    public void consumerMessage() {
        consumer.subscribe(Arrays.asList(KafkaProducer2.TOPIC));
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);
            for (ConsumerRecord<String, String> record : records) {
                System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
                System.out.println("**********  the record is key = "+ record.key()+"   value = "+record.value()+"  topic = "+record.topic());
                System.out.println("-------------  record to string is : "+record.toString());
            }
        }
    }

    public static void main(String[] args) {
        new KafkaConsumer2().consumerMessage();
    }

}
