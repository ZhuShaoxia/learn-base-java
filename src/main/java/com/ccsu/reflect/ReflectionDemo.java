package com.ccsu.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/3/20
 * @Time: 12:49
 * Description:
 */
public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName("com.ccsu.reflect.Bird");
        Method[] methods = aClass.getMethods();
        //aClass.getdecla
        for (Method method : methods){
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters){
                System.out.println(parameter.getName());
                System.out.println(parameter.getType());
            }

        }

    }
}
