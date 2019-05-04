package com.ccsu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/1/2
 * @Time: 23:03
 * Description:
 */
public class ProxyTest {
    public static void main(String[] args) {
        SmallMarket smallMarket = new SmallMarket();
        InvocationHandler supperMarketProxy = new SupperMarketProxy(smallMarket);
        SupperMarket supperMarket = (SupperMarket) Proxy.newProxyInstance(smallMarket.getClass().getClassLoader(), smallMarket.getClass().getInterfaces(), supperMarketProxy);
        supperMarket.sellApple();
    }
}
