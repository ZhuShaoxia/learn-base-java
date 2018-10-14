package com.ccsu.dataStructure.array;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/10/14
 * @Time: 18:50
 * Description:
 */
public class ArrayTest {
    public static void main(String[] args) {
        Array array = new Array(5);
        for (int i = 0; i < 5; i++) {
            array.insertToTail(i);
        }
        array.printAll();
        System.out.println(array.find(3));
        System.out.println(array.getCount());
    }
}
