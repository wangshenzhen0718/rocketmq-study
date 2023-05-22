package com.wang;

import com.wang.constant.MqConstant;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ARocketmqDemoApplicationTests {

	@Test
	void contextLoads() throws Exception{
		DefaultMQProducer producer = new DefaultMQProducer("test-producer-group");
		producer.setNamesrvAddr(MqConstant.NAME_SRV_ADDR);
		producer.start();
		Message message = new Message("testTopic","我是一个测试消息".getBytes());
		SendResult sendResult = producer.send(message);
		System.out.println(sendResult.getSendStatus());
		System.out.println(sendResult);
		producer.shutdown();


	}

}
