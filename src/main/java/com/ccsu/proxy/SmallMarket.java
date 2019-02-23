package com.ccsu.proxy;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/1/2
 * @Time: 23:01
 * Description:
 */
public class SmallMarket implements SupperMarket{
    @Override
    public void sellApple() {
        System.out.println("我开了个小超市卖苹果!");
    }
}
