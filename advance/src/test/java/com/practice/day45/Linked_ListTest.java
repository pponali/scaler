package com.practice.day45;

import com.practice.module6.day45.Linked_List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description
 */
class Linked_ListTest {

    @BeforeEach
    void setUp() {
        Linked_List.ListNode listNode = new Linked_List.ListNode(1);
        listNode.next = new Linked_List.ListNode(2);
        listNode.next.next = new Linked_List.ListNode(3);
        listNode.next.next.next = new Linked_List.ListNode(4);
        listNode.next.next.next.next = new Linked_List.ListNode(5);
        Linked_List.head = listNode;
    }

    @AfterEach
    void tearDown() {
        Linked_List.head = null;
        System.gc();
    }

    @Test
    void insert_node() {
        Linked_List.insert_node(5,4);
        Linked_List.print_ll();
    }

    @Test
    void delete_node() {
        Linked_List.delete_node(2);
        Linked_List.print_ll();
    }

    @Test
    void print_ll() {
        Linked_List.print_ll();
    }
}