package com.ajet.module6.day46;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author Prakash Ponali(@pponali)
 * @Date 05/12/23
 * @Description
 *
 * You are given a linked list that contains a loop.
 * You need to find the node, which creates a loop and break it by making the node point to NULL.
 *<p></p>
 *
 *
 * Problem Constraints
 * 1 <= number of nodes <= 1000
 *<p></p>
 *
 *
 * Input Format
 * The first of the input contains a LinkedList, where the first number is the number of nodes N, and the next N nodes are the node value of the linked list.
 * The second line of the input contains an integer which denotes the position of node where cycle starts.
 *<p></p>
 *
 *
 * Output Format
 * return the head of the updated linked list.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *
 * 1 -> 2
 * ^    |
 * | - -
 * Input 2:
 *<p></p>
 * 3 -> 2 -> 4 -> 5 -> 6
 *           ^         |
 *           |         |
 *           - - - - - -
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  1 -> 2 -> NULL
 * Output 2:
 *<p></p>
 *  3 -> 2 -> 4 -> 5 -> 6 -> NULL
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 *  Chain of 1->2 is broken.
 * Explanation 2:
 *
 *  Chain of 4->6 is broken.
 */

@Slf4j(topic = "RemoveLoopFromLinkedList")
@SuppressWarnings("ALL")
public class RemoveLoopFromLinkedList {

    public static ListNode removeLoop(ListNode head){
        if(head == null ){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        ListNode h2 = slow;
        ListNode h1 = head;
        ListNode prev = null;
        while(h1 != h2){
            prev = h2;
            h1 = h1.next;
            h2 = h2.next;
        }
        prev.next = null;
        return head;

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
