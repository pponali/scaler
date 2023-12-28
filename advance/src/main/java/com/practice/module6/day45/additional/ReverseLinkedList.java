package com.practice.module6.day45.additional;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author prakashponali (@pponali)
 * @Date 21/12/23 3:25 pm
 * @Description :
 */

@Slf4j
public class ReverseLinkedList {

    Node head;

    public void add(int i) {
        Node node = new Node(i);
        if(head == null){
            head = node;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display() {
        if(head != null){
            Node temp = head;
            while(temp != null){
                log.info("element {}", temp.data);
                temp = temp.next;
            }
        }
    }


    public class Node{

        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public void reverseList(Node head){
        if(head == null || head.next == null)
            return;
        Node prev = null;
        Node current = head;
        Node next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            this.head = prev;

        }

    }



}
