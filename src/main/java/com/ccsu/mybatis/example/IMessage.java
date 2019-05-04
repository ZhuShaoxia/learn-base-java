package com.ccsu.mybatis.example;

import com.ccsu.mybatis.bean.Message;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/12/31
 * @Time: 10:55
 * Description: 慕课网的老师布置的作业 模仿一个动态代理的过程
 */
public interface IMessage {
    List<Message> queryMessageList();
}
