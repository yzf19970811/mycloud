package com.kyu.app.mq;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

/**
 * @author kyu.yzf
 * @date 2023/12/24 16:50
 */
@Service
public class MqClientImpl implements MqClient {

    private final String group = "MC_TEST_GROUP";

    private final String topic = "MC_TEST";

    private final String addr = "1.94.109.187:9876";

    private DefaultMQProducer producer;

    @Override
    public void sendMsg() {
        try {
            if (producer == null) {
                producer = new DefaultMQProducer(group);
                producer.setNamesrvAddr(addr);
                producer.setSendMsgTimeout(10000);
                producer.start();
            }
            Message message = new Message();
            message.setTopic(topic);
            message.setKeys("messagekey");
            message.setBody("yuzhifa test message".getBytes(StandardCharsets.UTF_8));
            SendResult result = producer.send(message);
            String msgId = result.getMsgId();
            System.out.println("msgId = " + msgId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
