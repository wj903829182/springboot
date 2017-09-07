package com.jack.interf;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by jack on 2017/9/7.
 * 定义输出通道并绑定输出通道配置信息
 */
public interface Source {
    //OUTPUT_1 = "sourceA" 跟配置文件里面的通道名称 sourceA 保持一致
    //发送队列1
    String OUTPUT_1 = "sourceA";

    @Output(Source.OUTPUT_1)
    MessageChannel output1();
}
