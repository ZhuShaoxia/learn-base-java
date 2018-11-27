package com.ccsu.activeMQ.jms.producer;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/11/25
 * @Time: 21:34
 * Description: 定义一个生产者接口
 */
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    JmsTemplate jmsTemplate;

    @Resource(name = "queueDestination")
    Destination destination;

    @Override
    public void sendMessage(final String message) {
        jmsTemplate.send(destination, session -> {
            TextMessage textMessage = new ActiveMQTextMessage();
            textMessage.setText(message);
            return textMessage;
        });
    }
}
