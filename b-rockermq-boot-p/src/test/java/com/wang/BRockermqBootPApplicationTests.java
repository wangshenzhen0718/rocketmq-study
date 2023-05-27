package com.wang;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BRockermqBootPApplicationTests {
	@Autowired
	RocketMQTemplate rocketMQTemplate;

	@Test
	void contextLoads() {
		rocketMQTemplate.syncSend("boot-Best-topic","我是一个boot消息！！！");
	}

}
