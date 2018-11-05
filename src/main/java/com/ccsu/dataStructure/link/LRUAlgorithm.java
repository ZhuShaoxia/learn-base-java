package com.ccsu.dataStructure.link;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/11/5
 * @Time: 23:01
 * Description: LRU（latest-recently-used）最近最少使用策略
 */
public class LRUAlgorithm {

    private Node head;
    private int count;
    private int capacity;

    public LRUAlgorithm(int capacity) {
        this.capacity = capacity;
        this.count = 0;
    }

    public Node read(int value) {
        Node p = head;
        if (head != null) {
            Node q = head;
            while (p != null && p.data != value) {
                q = p;
                p = p.next;
            }
            q.next = p.next;
            p.next = head;
            head = p;
        }
        return p;
    }

    public void insert(int value) {
        if (!checkCapacity()) {

        }
        //if (count <= capacity) {
        //    Node node = new Node(value, null);
        //    insert(node);
        //} else {
        //
        //}
    }

    public void insert(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public boolean checkCapacity() {
        return count <= capacity;
    }

    public boolean removeLatestUsed() {
        return false;
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
