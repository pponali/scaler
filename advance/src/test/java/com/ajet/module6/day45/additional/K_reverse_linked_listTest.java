package com.ajet.module6.day45.additional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description
 */
class K_reverse_linked_listTest {

    K_reverse_linked_list.ListNode head = null;
    @BeforeEach
    void setUp() {
        head = new K_reverse_linked_list.ListNode(1);
        head.next = new K_reverse_linked_list.ListNode(2);
        head.next.next = new K_reverse_linked_list.ListNode(3);
        head.next.next.next = new K_reverse_linked_list.ListNode(4);
        head.next.next.next.next = new K_reverse_linked_list.ListNode(5);
        head.next.next.next.next.next = new K_reverse_linked_list.ListNode(6);
        head.next.next.next.next.next.next = new K_reverse_linked_list.ListNode(7);
        head.next.next.next.next.next.next.next = new K_reverse_linked_list.ListNode(8);
        head.next.next.next.next.next.next.next.next = new K_reverse_linked_list.ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new K_reverse_linked_list.ListNode(10);
    }

    @AfterEach
    void tearDown() {
        head = null;
        System.gc();
    }

    @Test
    void k_reverse() {
        K_reverse_linked_list.k_reverse_linked_list(head, 3);
        head = K_reverse_linked_list.k_reverse_linked_list(head, 3);
        K_reverse_linked_list.printList(head);
    }


}