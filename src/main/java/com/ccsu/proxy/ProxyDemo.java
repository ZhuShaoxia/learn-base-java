package com.ccsu.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/2/15
 * @Time: 16:46
 * Description:
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        AnimalProxy animalProxy = new AnimalProxy(cat);
        Say say = (Say) Proxy.newProxyInstance(Say.class.getClassLoader(),Say.class.getInterfaces(),animalProxy);
        say.say("1","2");
    }
}
