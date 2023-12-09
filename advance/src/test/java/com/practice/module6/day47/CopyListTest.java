package com.practice.module6.day47;

import com.practice.module6.day47.CopyList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 07/12/23
 * @Description
 */
class CopyListTest {

    CopyList copyList = null;
    @BeforeEach
    void setUp() {
        copyList = new CopyList();
        CopyList.RandomListNode head = new CopyList.RandomListNode(1);
        head.next = new CopyList.RandomListNode(2);
        head.next.next = new CopyList.RandomListNode(3);
        head.next.next.next = new CopyList.RandomListNode(4);
        head.next.next.next.next = new CopyList.RandomListNode(5);
        head.next.next.next.next.next = new CopyList.RandomListNode(6);
        head.next.next.next.next.next.next = new CopyList.RandomListNode(7);
        head.next.next.next.next.next.next.next = new CopyList.RandomListNode(8);
        head.next.next.random = head.next.next;
        head.next.next.next.random = head.next.next.next.next.next;
        head.next.next.next.next.next.random = head.next.next.next.next.next.next;
        head.next.random = head.next.next.next.next.next.next.next;
        head.next.next.next.next.next.next.random = head.next.next.next.next.next.next.next;
     //   head.next.next.next.next.next.next.next.next.next.random = head.next.next.next.next.next.next.next.next;
//        head.next.next.next.next.next.next.next.next.random = head.next.next.next.next.next.next.next.next.next;
      //  head.next.next.next.next.random = head.next.next.next.next.next.next.next.next.next.next;
      //  head.next.next.next.next.next.next.next.random = head.next.next.next.next.next.next.next.next.next.next.next;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void copyList() {
    }
}