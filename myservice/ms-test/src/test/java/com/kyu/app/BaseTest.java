package com.kyu.app;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

/**
 * @author kyu.yzf
 * @date 2023/12/24 18:09
 */
public class BaseTest {

    private final String group = "MC_TEST_GROUP";

    private final String topic = "MC_TEST";

    private final String addr = "1.94.109.187:9876";

    @Test
    public void test() throws MQClientException, MQBrokerException, RemotingException, InterruptedException {
        DefaultMQProducer mqProducer = new DefaultMQProducer(group);
        mqProducer.setNamesrvAddr(addr);
        mqProducer.setSendMsgTimeout(10000);
        mqProducer.start();
        Message message = new Message();
        message.setTopic(topic);
        message.setKeys("messagekey");
        message.setBody("yuzhifa test message".getBytes(StandardCharsets.UTF_8));
        SendResult result = mqProducer.send(message);
        String msgId = result.getMsgId();
        System.out.println("msgId = " + msgId);
    }
}
