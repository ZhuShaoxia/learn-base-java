package com.ccsu.introspector;

import org.apache.commons.lang3.StringUtils;

import javax.sound.midi.Soundbank;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/5/4
 * @Time: 10:28
 * Description:
 */
public class IntrospectorDemo {
    public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        //AnShenBuNaoYe anShenBuNaoYe = new AnShenBuNaoYe();
        //anShenBuNaoYe.setContent("this is an shen bu nao kou fu ye !");
        //
        //BeanInfo beanInfo = Introspector.getBeanInfo(AnShenBuNaoYe.class);
        //PropertyDescriptor[] props = beanInfo.getPropertyDescriptors();
        //for (PropertyDescriptor prop : props){
        //    System.out.println("writeMethod");
        //    Method writeMethod = prop.getWriteMethod();
        //    String name1 = writeMethod.getName();
        //    if ("name".equals(name1)){
        //        writeMethod.invoke(anShenBuNaoYe,"123");
        //    }
        //    System.out.println("readMethod");
        //    Method readMethod = prop.getReadMethod();
        //    String name = readMethod.getName();
        //    if (!"class".equals(name)){
        //        readMethod.invoke()
        //    }
        //}
        StringUtils.split("");
        AnShenBuNaoYe anShenBuNaoYe = new AnShenBuNaoYe();
        anShenBuNaoYe.setContent("123");
        anShenBuNaoYe.setEndDate("2019/12/30");
        anShenBuNaoYe.setSize(24);
        anShenBuNaoYe.setStartDate("2019/01/01");
        Map<String, Object> stringObjectMap = IntrospectorDemo.beanToMap(anShenBuNaoYe);
        for (Map.Entry entry:stringObjectMap.entrySet()){
            System.out.print("key="+entry.getKey()+"\t");
            System.out.println("value="+entry.getValue());
        }
    }
    public static <T> Map<String, Object> beanToMap(T bean) {
        Class<? extends Object> type = bean.getClass();
        Map<String, Object> returnMap = new HashMap<String, Object>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(type);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor descriptor : propertyDescriptors) {
                String propertyName = descriptor.getName();
                //System.out.println("propertyName="+propertyName);
                    if (!propertyName.equals("class")) {
                        Method readMethod = descriptor.getReadMethod();
                        Object result = readMethod.invoke(bean);
                        returnMap.put(propertyName, result != null ? result : "");
                    }
            }
        } catch (IntrospectionException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException("分析类属性失败", e);
        }
        return returnMap;
    }

}
