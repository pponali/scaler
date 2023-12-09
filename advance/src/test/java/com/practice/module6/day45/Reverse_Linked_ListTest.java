package com.practice.module6.day45;


import com.practice.module6.day45.Reverse_Linked_List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description
 */
class Reverse_Linked_ListTest {

    Reverse_Linked_List.ListNode head = null;
    @BeforeEach
    void setUp() {

        head = new Reverse_Linked_List.ListNode(1);
        head.next = new Reverse_Linked_List.ListNode(2);
        head.next.next = new Reverse_Linked_List.ListNode(3);
        head.next.next.next = new Reverse_Linked_List.ListNode(4);
        head.next.next.next.next = new Reverse_Linked_List.ListNode(5);

    }

    @AfterEach
    void tearDown() {
        head = null;
        System.gc();

    }

    @Test
    void reverseList() {
        head = Reverse_Linked_List.reverseList(head);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}