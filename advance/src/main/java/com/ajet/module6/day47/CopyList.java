package com.ajet.module6.day47;

import com.ajet.module6.day46.MergeTwoSortedLists;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author Prakash Ponali(@pponali)
 * @Date 07/12/23
 * @Description
 *
 * You are given a linked list A
 * Each node in the linked list contains two pointers: a next pointer and a random pointer
 * The next pointer points to the next node in the list
 * The random pointer can point to any node in the list, or it can be NULL
 * Your task is to create a deep copy of the linked list A
 * The copied list should be a completely separate linked list from the original list, but with the same node values and random pointer connections as the original list
 * You should create a new linked list B, where each node in B has the same value as the corresponding node in A
 * The next and random pointers of each node in B should point to the corresponding nodes in B (rather than A)
 *<p></p>
 *
 * Problem Constraints
 * 0 <= |A| <= 106
 *<p></p>
 *
 *
 * Input Format
 * The first argument of input contains a pointer to the head of linked list A.
 *<p></p>
 *
 *
 * Output Format
 * Return a pointer to the head of the required linked list.
 *<p></p>
 *
 *
 * Example Input
 * Given list
 *    1 -> 2 -> 3
 * with random pointers going from
 *   1 -> 3
 *   2 -> 1
 *   3 -> 1
 *<p></p>
 *
 *
 * Example Output
 *    1 -> 2 -> 3
 * with random pointers going from
 *   1 -> 3
 *   2 -> 1
 *   3 -> 1
 *<p></p>
 *
 *
 * Example Explanation
 * You should return a deep copy of the list. The returned answer should not contain the same node as the original list, but a copy of them. The pointers in the returned list should not link to any node in the original input list.
 */

@Slf4j
public class CopyList {

    public RandomListNode copyList(RandomListNode head) {
        if(head == null) return null;
        if(head.next == null) {
            RandomListNode h1 = new RandomListNode(head.label);
            h1.next = null;
            return h1;
        }
        RandomListNode curr = head;
        while(curr != null){
            RandomListNode newNode = new RandomListNode(curr.label);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        curr = head;
        while(curr != null){
            curr.next.random = curr.random == null ? null : curr.random.next;
            curr = curr.next.next;
        }
        curr = head;
        RandomListNode h2 = curr.next;
        while(curr != null){
            RandomListNode temp = curr.next;
            curr.next = temp.next;
            if(temp.next != null) temp.next = temp.next.next;
            curr = curr.next;
        }
        return h2;
    }


    public static class RandomListNode {
        public int label;
        public RandomListNode next;
        public RandomListNode random;

        public RandomListNode(int x) {
            label = x;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + label +
                    ", next=" + next +
                    '}';
        }
    }

    public void printList(MergeTwoSortedLists.ListNode l1) {
        log.info("Current linked list :: " + l1.toString());
    }
}
