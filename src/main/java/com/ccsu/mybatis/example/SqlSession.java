package com.ccsu.mybatis.example;

import java.lang.reflect.Proxy;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/12/31
 * @Time: 10:58
 * Description:
 */
public class SqlSession {
    public <T> T getMapper(Class<T> type) {
        return (T) Proxy.newProxyInstance(type.getClassLoader(), new Class[]{type}, new MapperProxy());
    }
}
