package com.practice.day46;

/**
 * @Author prakashponali
 * @Date 04/12/23
 * @Description
 */
public class Merge_Two_Sorted_Lists {

    public ListNode mergeTwoSortedList(ListNode  l1, ListNode l2){


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
        return null;
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
    }
}
