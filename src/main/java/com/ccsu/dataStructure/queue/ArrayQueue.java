package com.ccsu.dataStructure.queue;

/**
 * Created with IntelliJ IDEA.
 * Description: 基于数组实现的队列
 * Author: Xiaolei Zhu
 * Date: 2018-10-27
 * Time: 13:49
 * Email: mr.zhuxiaolei@gmail.com
 * URL:https://time.geekbang.org/column/article/41330
 */
public class ArrayQueue {
    private String[] items;//数组
    private int n = 0;//数组大小
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity) {
        this.items = new String[capacity];
        this.n = capacity;
    }

    /**
     * 入队操作:放一个数据到数据末尾
     *
     * @param item
     * @return
     */
    public boolean enqueue(String item) {
        if (tail == n) {
            if (head == 0) return false;//表示队列已经满了
            //数据搬移
            for (int i = head; i < tail; ++i) {
                items[i - head] = items[head];
            }
            //搬移完之后更新 head 和 tail
            tail -= head;
            head = 0;
        }
        items[tail] = item;
        ++head;
        return true;
    }

    /**
     * 出队操作：从队列头部取一个元素
     *
     * @return
     */
    public String dequeue() {
        if (head == tail) return null;
        String item = items[head];
        ++head;
        return item;
    }


}
