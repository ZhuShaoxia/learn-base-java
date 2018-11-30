package com.ccsu.activeMQ.jms.producer;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/11/25
 * @Time: 21:34
 * Description: 定义一个生产者接口
 */
public interface ProducerService {
    void sendMessage(String message);
}
