package com.practice.day46;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author prakashponali
 * @Date 04/12/23
 * @Description
 */

@Slf4j
public class Merge_Two_Sorted_Lists {

    public ListNode mergeTwoSortedList(ListNode  l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode head;
        ListNode tail;

        if(l1.val < l2.val){
            head = l1;
            tail = l1;
            l1 = l1.next;
        } else {
            head = l2;
            tail = l2;
            l2 = l2.next;
        }
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = l1 == null ? l2 : l1;

        return head;

        /*if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val < l2.val){
            l1.next = mergeTwoSortedList(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoSortedList(l1,l2.next);
            return l2;
        }*/


        /*ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 == null ? l2 : l1;
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
