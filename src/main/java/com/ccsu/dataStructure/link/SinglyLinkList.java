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
}
