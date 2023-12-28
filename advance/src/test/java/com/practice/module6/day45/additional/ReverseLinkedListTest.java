package com.practice.module6.day45.additional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author prakashponali (@pponali)
 * @Date 21/12/23 3:56 pm
 * @Description :
 */

@Slf4j
class ReverseLinkedListTest {

    ReverseLinkedList reverseLinkedList;
    @BeforeEach
    void setUp() {
        reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.add(1);
        reverseLinkedList.add(2);
        reverseLinkedList.add(3);
        reverseLinkedList.add(4);
        reverseLinkedList.add(5);
        reverseLinkedList.add(6);
        reverseLinkedList.add(7);
        reverseLinkedList.add(8);
        reverseLinkedList.add(9);
        reverseLinkedList.add(10);
        reverseLinkedList.add(11);
        reverseLinkedList.add(12);
        reverseLinkedList.add(13);
        reverseLinkedList.add(14);
        reverseLinkedList.add(15);
        reverseLinkedList.add(16);
        reverseLinkedList.add(17);
        reverseLinkedList.add(18);
        reverseLinkedList.add(19);
        reverseLinkedList.add(20);
        reverseLinkedList.add(21);
        reverseLinkedList.add(22);
        reverseLinkedList.add(23);
        reverseLinkedList.add(24);
        reverseLinkedList.add(25);
        reverseLinkedList.add(26);
        reverseLinkedList.add(27);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void reverseList() {
        reverseLinkedList.reverseList(reverseLinkedList.head);
        reverseLinkedList.display();
        ;
    }
}