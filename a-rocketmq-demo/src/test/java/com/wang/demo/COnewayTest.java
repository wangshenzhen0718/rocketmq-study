package com.wang.demo;


import com.wang.constant.MqConstant;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.junit.Test;
/**
 * @Author:wsz
 * @Date: 2023/5/24 21:54
 * @Description: 单向消息 日志
 * @Version: 1.0
 * @Since: 1.0
 */
public class COnewayTest {


    @Test
    public void onewayProducer() throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("oneway-producer-group");
        producer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
        producer.start();
        Message message = new Message("onewayTopic", "日志xxx".getBytes());
        producer.sendOneway(message);
        System.out.println("成功");
        producer.shutdown();
    }


}
