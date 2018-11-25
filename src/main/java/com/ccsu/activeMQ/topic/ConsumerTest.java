package com.ccsu.activeMQ.topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/11/17
 * @Time: 23:25
 * Description: 消息平台-主题模式-消费者
 */
public class ConsumerTest {
    private static final String url = "tcp://127.0.0.1:61616";//默认端口号
    private static final String topicName = "queue-test";

    public static void main(String[] args) throws JMSException {
        //1. 创建连接工厂
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        //2. 创建连接
        Connection connection = connectionFactory.createConnection();
        //3. 启动连接
        connection.start();
        //4. 创建会话
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //5. 创建一个目标
        Destination destination = session.createTopic(topicName);
        //6. 创建一个消费者
        MessageConsumer consumer = session.createConsumer(destination);
        //7. 创建一个监听器
        consumer.setMessageListener(message -> {
            TextMessage textMessage = ((TextMessage) message);
            try {
                System.out.println("接收的消息" + textMessage.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        });

        //8. 关闭连接
        //connection.close();

    }
}
