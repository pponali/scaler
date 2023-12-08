package com.practice.day46;

import com.practice.module6.day46.RemoveLoopFromLinkedList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali(@pponali)
 * @Date 05/12/23
 * @Description
 */
class RemoveLoopFromLinkedListTest {

    RemoveLoopFromLinkedList.ListNode  head;
    @BeforeEach
    void setUp() {
        head = new RemoveLoopFromLinkedList.ListNode(1);
        head.next = new RemoveLoopFromLinkedList.ListNode(2);
        head.next.next = new RemoveLoopFromLinkedList.ListNode(3);
        head.next.next.next = new RemoveLoopFromLinkedList.ListNode(4);
        head.next.next.next.next = new RemoveLoopFromLinkedList.ListNode(5);
        head.next.next.next.next.next = head.next.next;
        //System.out.println(head);

    }

    @AfterEach
    void tearDown() {
        head = null;
        System.gc();
        System.out.println(head);
    }

    @Test
    void removeLoop() {
        head = RemoveLoopFromLinkedList.removeLoop(head);
        assertEquals(1,head.val);
        RemoveLoopFromLinkedList.printList(head);

    }
}