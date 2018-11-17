package com.ccsu.activeMQ.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/11/11
 * @Time: 20:28
 * Description: 队列消费者模式学习
 * 消息平台-队列模式-生产者
 * activemq 后台管理界面 ：http://127.0.0.1:8161/admin/
 */
public class ProducerTest {
    private static final String url = "tcp://127.0.0.1:61616";//默认端口号
    private static final String queueName  = "queue-test";
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
        //6. 创建一个生产者
        MessageProducer producer = session.createProducer(destination);
        for (int i = 0 ; i < 100 ; i++){
            //7. 创建消息
            TextMessage textMessage = session.createTextMessage("text "+i);
            //8. 发布消息
            producer.send(textMessage);
        }
        //9. 关闭连接
        connection.close();

    }

}
