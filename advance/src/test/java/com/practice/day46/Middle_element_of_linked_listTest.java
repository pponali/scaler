package com.practice.day46;

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
class Middle_element_of_linked_listTest {
    Middle_element_of_linked_list.ListNode head = null;

    /**
     * @BeforeEach is a JUnit 5 annotation that is used to initialize the test data before each test method is executed.
     * It is a method that is executed before each test method.
     *
     */
    @BeforeEach
    void setUp() {
        head = new Middle_element_of_linked_list.ListNode(1);
        head.next = new Middle_element_of_linked_list.ListNode(2);
        head.next.next = new Middle_element_of_linked_list.ListNode(3);
        head.next.next.next = new Middle_element_of_linked_list.ListNode(4);
        head.next.next.next.next = new Middle_element_of_linked_list.ListNode(5);
        head.next.next.next.next.next = new Middle_element_of_linked_list.ListNode(6);
        head.next.next.next.next.next.next = new Middle_element_of_linked_list.ListNode(7);
        head.next.next.next.next.next.next.next = new Middle_element_of_linked_list.ListNode(8);
        log.info(String.valueOf(head));
    }

    @AfterEach
    void tearDown() {
        head = null;
        log.info("After Each");
        log.info("Freeing Memory");
        System.runFinalization();
        System.gc();

    }

    @Test
    void middleElementOfLinkedList() {
        int  middle  = Middle_element_of_linked_list.middleElementOfLinkedList(head);
        log.info("middle " + middle);
        assertEquals(middle, 5);
    }
    @Test
    void middleElementOfLinkedOdd() {
        head.next.next.next.next.next.next.next.next = new Middle_element_of_linked_list.ListNode(9);
        int  middle  = Middle_element_of_linked_list.middleElementOfLinkedList(head);
        log.info("middle " + middle);
        assertEquals(middle, 5);
    }
}