package com.ccsu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/2/15
 * @Time: 16:54
 * Description:
 */
public class AnimalProxy implements InvocationHandler {

    public Say animal;
    public AnimalProxy(Say animal){
        this.animal = animal;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动物开始大喊大叫");
        method.invoke(animal,args);
        System.out.println("动物结束大喊大叫");
        return null;
    }
}
