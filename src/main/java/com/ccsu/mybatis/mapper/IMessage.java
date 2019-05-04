package com.ccsu.mybatis.mapper;

import com.ccsu.mybatis.bean.Message;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/12/30
 * @Time: 11:37
 * Description:
 */
public interface IMessage {
    List<Message> queryAll();
}
