package com.practice.module6.day46;

import com.practice.module6.day46.SortList;
import com.practice.module6.day46.SortList.ListNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali(@pponali)
 * @Date 05/12/23
 * @Description
 */
class SortListTest {

    ListNode head;
    SortList sortList;

    @Test
    void findMid1() {

        ListNode mid = sortList.findMid(head);
        System.out.println(mid.val);
        assertEquals(9, mid.val);
        assertEquals(5, mid.next.val);
        assertEquals(1, mid.next.next.val);
        assertEquals(3, mid.next.next.next.val);
    }

    @Test
    void merge1() {
        ListNode mid =  sortList.findMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        ListNode newHead = sortList.merge(left, right);
        System.out.println(newHead.val);
        assertEquals(5, newHead.val);
        assertEquals(1, newHead.next.val);
        assertEquals(3, newHead.next.next.val);
        assertEquals(4, newHead.next.next.next.val);
        assertEquals(12, newHead.next.next.next.next.val);
        assertEquals(11, newHead.next.next.next.next.next.val);
        assertEquals(2, newHead.next.next.next.next.next.next.val);
        assertEquals(9, newHead.next.next.next.next.next.next.next.val);
        assertNull(newHead.next.next.next.next.next.next.next.next);
    }

    @Test
    void sortList1() {
        ListNode newHead = sortList.sortList(head);
        System.out.println(newHead.val);
        assertEquals(1, newHead.val);
        assertEquals(2, newHead.next.val);
        assertEquals(3, newHead.next.next.val);
        assertEquals(4, newHead.next.next.next.val);
        assertEquals(5, newHead.next.next.next.next.val);
        assertEquals(9, newHead.next.next.next.next.next.val);
        assertEquals(11, newHead.next.next.next.next.next.next.val);
        assertEquals(12, newHead.next.next.next.next.next.next.next.val);
        assertNull(newHead.next.next.next.next.next.next.next.next);
        SortList.printList(newHead);
    }

    @Test
    void findMid2() {
    }

    @Test
    void merge2() {
    }

    @Test
    void sortList2() {
    }

    @Test
    void findMid3() {
    }

    @Test
    void merge3() {
    }

    @Test
    void sortList3() {
    }

    @Test
    void findMid4() {
    }

    @Test
    void merge4() {
    }

    @Test
    void sortList4() {
    }

    @Test
    void findMid5() {
    }

    @Test
    void merge5() {
    }

    @Test
    void sortList5() {
    }

    @Test
    void findMid6(){

    }


    @BeforeEach
    void setUp() {
        sortList = new SortList();
        ListNode head = new ListNode(12);
        head.next = new ListNode(11);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(9);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next = new ListNode(4);
        this.head = head;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findMid() {
    }

    @Test
    void merge() {
    }

    @Test
    void sortList() {
    }
}