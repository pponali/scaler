package com.ajet.module6.day45.additional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author prakashponali
 * @Date 04/12/23
 * @Description
 */

@Slf4j
class Remove_Nth_Node_from_List_EndTest {

    Remove_Nth_Node_from_List_End.ListNode head = null;
    @BeforeEach
    void setUp() {
        log.info("Before Each");
        head = new Remove_Nth_Node_from_List_End.ListNode(1);
        head.next = new Remove_Nth_Node_from_List_End.ListNode(2);
        head.next.next = new Remove_Nth_Node_from_List_End.ListNode(3);
        head.next.next.next = new Remove_Nth_Node_from_List_End.ListNode(4);
        head.next.next.next.next = new Remove_Nth_Node_from_List_End.ListNode(5);
    }

    @AfterEach
    void tearDown() {
        log.info("After each");
    }

    @Test
    void removeNthNodeLast() {
        head = Remove_Nth_Node_from_List_End.removeNthNode(head, 2);
        Remove_Nth_Node_from_List_End.printList(head);
    }

    @Test
    void removeNthNode() {
        head = Remove_Nth_Node_from_List_End.removeNthNode(head, 1);
        Remove_Nth_Node_from_List_End.printList(head);
    }

    @Test
    void removeFirstNode() {
        head = Remove_Nth_Node_from_List_End.removeNthNode(head, 5);
        Remove_Nth_Node_from_List_End.printList(head);
    }
}