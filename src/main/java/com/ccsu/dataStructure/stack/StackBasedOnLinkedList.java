package com.ccsu.dataStructure.stack;

/**
 * @Author: Xiaolei Zhu
 * @Date: 2018/10/25 17:27
 * @Describe:
 * @Email: mr.zhuxiaolei@gmail.com
 */
public class StackBasedOnLinkedList {
    private Node top = null;

    /**
     * 1. 第一个值插入
     * 2. 之后节点插入:相当于每次都是插入到头结点
     * @param value
     */
    public void push(int value) {
        Node newNode = new Node(value, null);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (top == null) {
            return -1;
        }
        top = top.next;
        return top.data;
    }

    public void printAll() {
        Node p = top;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        StackBasedOnLinkedList stackBasedOnLinkedList = new StackBasedOnLinkedList();
        for (int i = 0; i < 5; i++) {
            stackBasedOnLinkedList.push(i);
        }
        stackBasedOnLinkedList.printAll();
    }
}
