package com.practice.day46;

import com.practice.module6.day46.MergeTwoSortedLists;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author Prakash Ponali
 * @Date 04/12/23
 * @Description
 */
class MergeTwoSortedListsTest {

    MergeTwoSortedLists.ListNode l1;
    MergeTwoSortedLists.ListNode l2;

    @BeforeEach
    void setUp() {
        l1 = new MergeTwoSortedLists.ListNode(1);
        l1.next = new MergeTwoSortedLists.ListNode(2);
        l1.next.next = new MergeTwoSortedLists.ListNode(4);
        l2 = new MergeTwoSortedLists.ListNode(1);
        l2.next = new MergeTwoSortedLists.ListNode(3);
        l2.next.next = new MergeTwoSortedLists.ListNode(4);
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
        MergeTwoSortedLists merge_two_sorted_lists = new MergeTwoSortedLists();
        MergeTwoSortedLists.ListNode result = merge_two_sorted_lists.mergeTwoSortedList(l1,l2);
        result.printList(result);
    }
}