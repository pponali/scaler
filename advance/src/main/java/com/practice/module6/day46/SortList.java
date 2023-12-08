package com.practice.module6.day46;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author Prakash Ponali(@pponali)
 * @Date 05/12/23
 * @Description
 */

@Slf4j
public class SortList {


    public  ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }

    public  ListNode merge(ListNode left, ListNode right) {
        if (left == null) return right;
        if (right == null) return left;
        ListNode head, tail;
        if(left.val < right.val) {
            head = left;
            tail = left;
            left = left.next;
        } else {
            head = right;
            tail = right;
            right = right.next;
        }
        while (left != null && right != null) {
            if (left.val < right.val) {
                tail.next = left;
                tail = left;
                left = left.next;
            } else {
                tail.next = right;
                tail = right;
                right = right.next;
            }
        }
        tail.next = left == null ? right : left;
        return head;
    }


    public  ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        //step 1 : find mid and break the list into two parts.
        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        //step 2 : sort both the parts and merge them.
        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        // Step 3. Merge l1 and l2
        return merge(left, right);


        /*if (head == null || head.next == null) return head;
        ListNode mid = findMid(head);
       // mid.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);*/  // merge two sorted list and return head.
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void printList(ListNode l1) {
        log.info("Current linked list :: " + l1.toString());
    }

}
