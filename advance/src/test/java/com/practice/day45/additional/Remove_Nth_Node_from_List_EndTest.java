package com.practice.day45.additional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author prakashponali
 * @Date 04/12/23
 * @Description
 */

@Slf4j
class Remove_Nth_Node_from_List_EndTest {

    Remove_Nth_Node_from_List_End.Node head = null;
    @BeforeEach
    void setUp() {
        log.info("Before Each");
        head = new Remove_Nth_Node_from_List_End.Node(1);
        head.next = new Remove_Nth_Node_from_List_End.Node(2);
        head.next.next = new Remove_Nth_Node_from_List_End.Node(3);
        head.next.next.next = new Remove_Nth_Node_from_List_End.Node(4);
        head.next.next.next.next = new Remove_Nth_Node_from_List_End.Node(5);
    }

    @AfterEach
    void tearDown() {
        log.info("After each");
    }

    @Test
    void removeNthNode() {
        head = Remove_Nth_Node_from_List_End.removeNthNode(head, 2);
        Remove_Nth_Node_from_List_End.printList(head);
    }
}