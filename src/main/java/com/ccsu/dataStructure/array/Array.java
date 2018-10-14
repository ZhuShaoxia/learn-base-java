package com.ccsu.dataStructure.array;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/10/14
 * @Time: 18:30
 * Description:数组的查、增、删
 */
public class Array {
    /**
     * 定义data保存数据
     */
    private int data[];
    /**
     * 定义数组实际长度
     */
    private int count;
    /**
     * 定义数组容量
     */
    private int capacity;

    public Array(int capacity) {
        this.data = new int[capacity];
        this.capacity = capacity;
        this.count = 0;
    }

    /**
     * 找数据
     *
     * @param index
     * @return
     */
    public int find(int index) {
        if (index < 0 || index >= count) {
            return -1;
        }
        return data[index];
    }

    /**
     * 加数据
     *
     * @param index
     * @param value
     * @return
     */
    public boolean insert(int index, int value) {
        if (index < 0 || index >= count) {
            return false;
        }
        if (count == capacity) {
            return false;
        }
        for (int i = count - 1; i < count; i--) {
            data[i + 1] = data[i];
        }
        data[index] = value;
        ++count;
        return true;
    }

    /**
     * 数据加到末尾
     *
     * @param value
     * @return
     */
    public boolean insertToTail(int value) {
        if (count == capacity) {
            return false;
        }
        data[count++] = value;
        return true;
    }

    /**
     * 删除指定位置数据
     *
     * @param index
     * @return
     */
    public boolean delete(int index) {
        if (index < 0 || index >= count) {
            return false;
        }
        for (int i = index + 1; i < count; i++) {
            data[i - 1] = data[i];
        }
        --count;
        return true;
    }

    /**
     * 打印此数组
     */
    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    /**
     * 获得数组长度
     * @return
     */
    public int getCount(){
        return count;
    }


}
