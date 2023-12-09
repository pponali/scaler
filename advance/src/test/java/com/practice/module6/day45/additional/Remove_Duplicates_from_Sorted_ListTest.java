package com.practice.module6.day45.additional;

import com.practice.module6.day45.additional.Remove_Duplicates_from_Sorted_List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description
 */
class Remove_Duplicates_from_Sorted_ListTest {

    Remove_Duplicates_from_Sorted_List.ListNode node = null;
    @BeforeEach
    void setUp() {
        node = new Remove_Duplicates_from_Sorted_List.ListNode(1);
        node.next = new Remove_Duplicates_from_Sorted_List.ListNode(2);
        node.next.next = new Remove_Duplicates_from_Sorted_List.ListNode(3);
        node.next.next.next = new Remove_Duplicates_from_Sorted_List.ListNode(3);
        node.next.next.next.next = new Remove_Duplicates_from_Sorted_List.ListNode(4);
        node.next.next.next.next.next = new Remove_Duplicates_from_Sorted_List.ListNode(4);
        node.next.next.next.next.next.next = new Remove_Duplicates_from_Sorted_List.ListNode(5);



    }

    @AfterEach
    void tearDown() {
         node = null;
         System.gc();
    }

    @Test
    void deleteDuplicates() {
        Remove_Duplicates_from_Sorted_List.ListNode result = new Remove_Duplicates_from_Sorted_List().deleteDuplicates(node);
        System.out.println(result);
    }
}