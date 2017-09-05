package com.jack.producer;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;


import java.util.Properties;

/**
 * Created by jack on 2017/9/5.
 * kafka生产者
 */
/*public class KafkaProducer {
    private final Producer<String, String> producer;
    public final static String TOPIC = "JACK";

    private KafkaProducer() {
        Properties props = new Properties();*/
        /**
         * 使用这个参数传入boker和分区的静态信息，如host1:port1,host2:port2, 这个可以是全部boker的一部分
         */
   /*     // 此处配置的是kafka的端口
        props.put("metadata.broker.list", "127.0.0.1:9092");
        props.put("zk.connect", "127.0.0.1:2181");

        // 配置value的序列化类
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        // 配置key的序列化类
        props.put("key.serializer.class", "kafka.serializer.StringEncoder");*/

        /**
         * 0：这意味着生产者producer不等待来自broker同步完成的确认继续发送下一条（批）消息。此选项提供最低的延迟但最弱的耐久性保证（当服务器发生故障时某些数据会丢失，如leader已死，但producer并不知情，发出去的信息broker就收不到）。

         1：这意味着producer在leader已成功收到的数据并得到确认后发送下一条message。此选项提供了更好的耐久性为客户等待服务器确认请求成功（被写入死亡leader但尚未复制将失去了唯一的消息）。

         -1：这意味着producer在follower副本确认接收到数据后才算一次发送完成。
         此选项提供最好的耐久性，我们保证没有信息将丢失，只要至少一个同步副本保持存活。
         */
       /* props.put("request.required.acks", "-1");

        producer = new Producer<String, String>(new ProducerConfig(props));
    }*/

   /* void produce() {
        int messageNo = 1000;
        final int COUNT = 10000;

        while (messageNo < COUNT) {
            String key = String.valueOf(messageNo);
            String data = "hello kafka message " + key;
            producer.send(new KeyedMessage<String, String>(TOPIC, key, data));
            System.out.println(data);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            messageNo++;
        }
    }

    public static void main(String[] args) {
        new KafkaProducer().produce();
    }
}
*/