package com.practice.day46;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author Prakash Ponali
 * @Date 04/12/23
 * @Description
 */
class MergeTwoSortedListsTest {

    Merge_Two_Sorted_Lists.ListNode l1;
    Merge_Two_Sorted_Lists.ListNode l2;

    @BeforeEach
    void setUp() {
        l1 = new Merge_Two_Sorted_Lists.ListNode(1);
        l1.next = new Merge_Two_Sorted_Lists.ListNode(2);
        l1.next.next = new Merge_Two_Sorted_Lists.ListNode(4);
        l2 = new Merge_Two_Sorted_Lists.ListNode(1);
        l2.next = new Merge_Two_Sorted_Lists.ListNode(3);
        l2.next.next = new Merge_Two_Sorted_Lists.ListNode(4);
        l1.printList(l1);
    }

    @AfterEach
    void tearDown() {
        l1 = null;
        l2 = null;
        System.gc();
        System.out.println("After GC");
    //        l1.printList(l1);
    //        l2.printList(l2);
    }

    @Test
    void mergeTwoSortedList() {
        Merge_Two_Sorted_Lists merge_two_sorted_lists = new Merge_Two_Sorted_Lists();
        Merge_Two_Sorted_Lists.ListNode result = merge_two_sorted_lists.mergeTwoSortedList(l1,l2);
        result.printList(result);
    }
}