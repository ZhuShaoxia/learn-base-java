package com.ccsu.dataStructure.link;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/10/24
 * @Time: 23:29
 * Description:单链表的插入、删除、操作
 */
public class SinglyLinkList {
    private Node head = null;

    public void insertToHead(int value) {
        Node node = new Node(value, null);
        insertToHead(node);
    }

    public void insertToHead(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAfter(Node p, int value) {
        Node node = new Node(value, null);
        inertAfter(p, node);
    }

    public void inertAfter(Node p, Node newNode) {
        if (p == null) {
            return;
        }
        newNode.next = p.next;
        p.next = newNode;
    }

    public void insertBefore(Node p, int value) {

    }

    public void insertBefore(Node p, Node newNode) {
        if (p == null) {
            return;
        }
        if (p == head) {
            insertToHead(newNode);
        }
        Node q = head;
        while (q != null && q.next == p) {
            q.next = p;
        }
        if (q == null) {
            return;
        }
        q.next = newNode;
        newNode.next = p;

    }

    public void deleteByNode(Node p) {
        if (head == null || p == null) {
            return;
        }
        if (head == p) {
            head = head.next;
            return;
        }
        Node q = head;
        while (q.next != p) {
            q = q.next;
        }
        if (q == null) {
            return;
        }
        q.next = q.next.next;
    }

    public void deleteByValue(int value) {
        Node node = new Node(value, null);
        deleteByNode(node);
    }

    public void printAll() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

    }

    /**
     * 定义每一个节点
     */
    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkList singlyLinkList = new SinglyLinkList();
        for (int i = 0; i < 5; i++) {
            singlyLinkList.insertToHead(i);
        }
        singlyLinkList.printAll();
    }
}

