package com.practice.day46;

import java.util.List;

/**
 * @Author prakashponali
 * @Date 04/12/23
 * @Description Given a linked list of integers, find and return the middle element of the linked list.
 * <p>
 * NOTE: If there are N nodes in the linked list and N is even then return the (N/2 + 1)th element.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= length of the linked list <= 100000
 * <p>
 * 1 <= Node value <= 109
 * <p>
 * <p>
 * <p>
 * Input Format The only argument given head pointer of linked list.
 * <p>
 * <p>
 * <p>
 * Output Format Return the middle element of the linked list.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * 1 -> 2 -> 3 -> 4 -> 5 Input 2:
 * <p>
 * 1 -> 5 -> 6 -> 2 -> 3 -> 4
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 3 Output 2:
 * <p>
 * 2
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * The middle element is 3. Explanation 2:
 * <p>
 * The middle element in even length linked list of length N is ((N/2) + 1)th element which is 2.
 */
public class Middle_element_of_linked_list {

    public static int middleElementOfLinkedList(ListNode A) {
        ListNode s = A;
        ListNode f = A;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        if(f.next == null){
            return s.val;
        } else {
            return s.next.val;
        }
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
