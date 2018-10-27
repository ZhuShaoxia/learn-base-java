package com.ccsu.dataStructure.queue;

/**
 * Created with intelliJ IDEA.
 * Description: 基于单链表的队列
 * Author: Xiaolei Zhu
 * Date: 2018-10-27
 * Time: 14:28
 * Email: mr.zhuxiaolei@gmail.com
 */
public class QueueBasedOnLinkedList {
    private Node head = null;
    private Node tail = null;

    /**
     * 入队操作
     * @param value
     */
    public void enqueue(String value) {

        Node newNode = new Node(value, null);
        if (head == null || tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }

    }

    /**
     * 出队操作
     * @return
     */
    public String dequeue() {
        if (head == null) {
            return null;
        }
        Node node = head;
        head = head.next;
        if (head == null) {//当头的下个结点为空时，则尾巴也为空
            tail = null;
        }
        return node.data;
    }


    public static class Node {
        private String data;
        private Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
