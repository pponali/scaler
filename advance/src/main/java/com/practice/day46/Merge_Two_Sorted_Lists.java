package com.practice.day46;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author prakashponali
 * @Date 04/12/23
 * @Description
 * Merge two sorted linked lists, A and B, and return it as a new list.
 *
 * The new list should be made by splicing together the nodes of the first two lists and should also be sorted.
 *
 *
 *
 * Problem Constraints
 * 0 <= |A|, |B| <= 105
 *
 *
 *
 * Input Format
 * The first argument of input contains a pointer to the head of linked list A.
 *
 * The second argument of input contains a pointer to the head of linked list B.
 *
 *
 *
 * Output Format
 * Return a pointer to the head of the merged linked list.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = 5 -> 8 -> 20
 *  B = 4 -> 11 -> 15
 * Input 2:
 *
 *  A = 1 -> 2 -> 3
 *  B = Null
 *
 *
 * Example Output
 * Output 1:
 *
 *  4 -> 5 -> 8 -> 11 -> 15 -> 20
 * Output 2:
 *
 *  1 -> 2 -> 3
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Merging A and B will result in 4 -> 5 -> 8 -> 11 -> 15 -> 20
 * Explanation 2:
 *
 *  We don't need to merge as B is empty.
 *
 */

@Slf4j
public class Merge_Two_Sorted_Lists {

    public ListNode mergeTwoSortedList(ListNode  A, ListNode B){
        if(A == null) return B;
        if(B == null) return A;
        ListNode head;
        ListNode tail;

        if(A.val < B.val){
            head = A;
            tail = A;
            A = A.next;
        } else {
            head = B;
            tail = B;
            B = B.next;
        }
        while(A != null && B != null){
            if(A.val < B.val){
                tail.next = A;
                A = A.next;
            } else {
                tail.next = B;
                B = B.next;
            }
            tail = tail.next;
        }
        tail.next = A == null ? B : A;

        return head;

        /*if(A == null) return l2;
        if(l2 == null) return A;

        if(A.val < l2.val){
            A.next = mergeTwoSortedList(A.next,l2);
            return A;
        }else{
            l2.next = mergeTwoSortedList(A,l2.next);
            return l2;
        }*/


        /*ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(A != null && l2 != null){
            if(A.val < l2.val){
                curr.next = A;
                A = A.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = A == null ? l2 : A;
        return dummy.next;*/

    }

    public static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) {
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

        public void printList(ListNode l1) {
            log.info("Current linked list :: " + l1.toString());
        }
    }
}
