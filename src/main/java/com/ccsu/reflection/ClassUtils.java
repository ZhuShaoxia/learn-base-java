package com.ccsu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/1/20
 * @Time: 13:42
 * Description:
 */
public class ClassUtils {
    public static void printClassMessage(Object object) {

        Class<?> aClass = object.getClass();
        System.out.println("类名:" + aClass.getName());
        //Method[] methods = aClass.getMethods();//包含父类继承而来的方法，所有public
        Method[] methods = aClass.getDeclaredMethods();//所有该类自己生命的方法，不问访问权限
        aClass.getAnnotations();
        Constructor constructor = aClass.getConstructors()[0];
        for (int i = 0; i < methods.length; i++) {
            //获取方法的返回类型
            Class<?> returnType = methods[i].getReturnType();
            System.out.print(returnType.getName() + " ");
            //获取方法的名称
            System.out.print(methods[i].getName() + "( ");
            methods[i].getParameterTypes();
            //methods[i].getParameterTypes();

            //获取方法的返回参数
            Class<?>[] parameterTypes = methods[i].getParameterTypes();
            for (Class c : parameterTypes) {
                System.out.print(c.getSimpleName() + ",");
            }
            System.out.println(" ) ");
        }

    }
}
