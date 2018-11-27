package com.ccsu.activeMQ.jms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/11/25
 * @Time: 21:50
 * Description:
 */
public class AppProducer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService producerService = context.getBean(ProducerServiceImpl.class);
        for (int i = 0; i < 50; i++) {
            producerService.sendMessage("text-" + i);
        }
    }
}
