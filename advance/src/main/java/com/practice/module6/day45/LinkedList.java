package com.practice.module6.day45;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author prakashponali (@pponali)
 * @Date 21/12/23 10:26 am
 * @Description :
 */
@Slf4j
public class LinkedList {

    Node head;
    Node tail;
    int size;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
        }
        size++;

    }

    public void insertAt(int data, int index) {
        Node node = new Node(data);
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    public void display() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            log.info("Data at node {}, is {}", i, temp.data);
            temp = temp.next;
        }
    }

    public void deleteAt(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            size--;
        }
    }


}
