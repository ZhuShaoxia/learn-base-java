package com.ccsu.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/1/20
 * @Time: 13:13
 * Description:
 */
public class Food {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //Class<?> aClass = Class.forName("");
        //aClass.newInstance();
        //System.out.println(args);
        //ClassUtils.printClassMessage(new Food());
        Class<?> aClass = Class.forName("com.ccsu.reflection.Food");
        Method aaa = aClass.getMethod("bbb", int.class, int.class);
        aaa.invoke(aClass.newInstance(), 10, 2);
    }

    public String aaa(String a, String b) {
        String x = "123";
        return x;
    }

    public int bbb(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
}
