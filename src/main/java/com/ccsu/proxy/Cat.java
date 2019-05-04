package com.ccsu.proxy;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/2/15
 * @Time: 16:46
 * Description:
 */
public class Cat implements Say {
    @Override
    public String say(String a, String b) {
        return a + b;
    }
}
