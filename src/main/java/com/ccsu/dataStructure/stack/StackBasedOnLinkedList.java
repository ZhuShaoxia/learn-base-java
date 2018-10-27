package com.ccsu.dataStructure.stack;

/**
 * @Author: Xiaolei Zhu
 * @Date: 2018/10/25 17:27
 * @Describe: 基于链表实现的链式栈
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

    /**
     * 1. 当头为空 返回 <p>-1</p>
     * 2. 当头不为空时，返回头的值，再指向下一个结点
     * @return
     */
    public int pop() {
        if (top == null) {
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
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
        System.out.println();
        for(int i = 0  ; i < 5 ; i++){
            int value = stackBasedOnLinkedList.pop();
            System.out.print(value+" ");
        }
    }
}
