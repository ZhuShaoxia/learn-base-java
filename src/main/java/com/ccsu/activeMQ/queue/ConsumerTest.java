package com.ccsu.activeMQ.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/11/17
 * @Time: 23:25
 * Description: 消息平台-队列模式-消费者
 * 多个消费者的时候 会平分生产者产生的消息
 * 多个 Consumer 可以注册到同一个 queue 上，
 * 但一个消息只能被一个 Consumer 所接收，
 * 然后由该 Consumer 来确认消息。
 * 并且在这种情况下，Provider 对所有注册的 Consumer 以*轮询*的方式发送消息。
 *
 */
public class ConsumerTest {
    private static final String url = "tcp://127.0.0.1:61616";//默认端口号
    private static final String queueName = "queue-test";

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
        Destination destination = session.createQueue(queueName);
        //6. 创建一个消费者
        MessageConsumer consumer = session.createConsumer(destination);
        //7. 创建一个监听器 如下为异步接收
        consumer.setMessageListener(message -> {
            TextMessage textMessage = ((TextMessage) message);
            try {
                System.out.println("接收的消息" + textMessage.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        });
        //7 同步接收
        Message receive = consumer.receive();


        //8. 关闭连接
        //connection.close();

    }
}
