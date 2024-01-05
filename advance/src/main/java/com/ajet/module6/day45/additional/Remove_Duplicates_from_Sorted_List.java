package com.ajet.module6.day45.additional;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description
 *
 * Given a sorted linked list, delete all duplicates such that each element appears only once.
 *<p></p>
 *
 *
 * Problem Constraints
 * 0 <= length of linked list <= 106
 *<p></p>
 *
 *
 * Input Format
 * First argument is the head pointer of the linked list.
 *<p></p>
 *
 *
 * Output Format
 * Return the head pointer of the linked list after removing all duplicates.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *  1->1->2
 * Input 2:
 *<p></p>
 *  1->1->2->3->3
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  1->2
 * Output 2:
 *<p></p>
 *  1->2->3
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Each element appear only once in 1->2.
 */
public class Remove_Duplicates_from_Sorted_List {


    public ListNode deleteDuplicates(ListNode A) {
        if(A == null || A.next == null) return A;
        ListNode current = A;
        ListNode pre = A;
        while(current != null){
            if(pre.val != current.val){
                pre.next = current;
                pre = current;
            }
            current = current.next;
        }
        pre.next = null;
        return A;
    }

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
