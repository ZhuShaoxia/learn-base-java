package com.ccsu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/1/2
 * @Time: 22:59
 * Description:
 */
public class SupperMarketProxy implements InvocationHandler {

    private Object market;

    public SupperMarketProxy(Object obj) {
        this.market = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我要开始卖东西了!");
        method.invoke(market, args);
        System.out.println("我要结束卖东西了!");
        return null;
    }
}
