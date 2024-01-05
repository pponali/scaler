package com.ajet.module6.day45;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description
 *
 * You are given a singly linked list having head node A. You have to reverse the linked list and return the head node of that reversed list.
 *<p></p>
 * NOTE: You have to do it in-place and in one-pass.
 *<p></p>
 *
 *
 * Problem Constraints
 * 1 <= Length of linked list <= 105
 *<p></p>
 * Value of each node is within the range of a 32-bit integer.
 *<p></p>
 *
 *
 * Input Format
 * First and only argument is a linked-list node A.
 *<p></p>
 *
 *
 * Output Format
 * Return a linked-list node denoting the head of the reversed linked list.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *  A = 1 -> 2 -> 3 -> 4 -> 5 -> NULL
 * Input 2:
 *<p></p>
 *  A = 3 -> NULL
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  5 -> 4 -> 3 -> 2 -> 1 -> NULL
 * Output 2:
 *<p></p>
 *  3 -> NULL
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 *  The linked list has 5 nodes. After reversing them, the list becomes : 5 -> 4 -> 3 -> 2 -> 1 -> NULL
 * Expalantion 2:
 *
 *  The linked list consists of only a single node. After reversing it, the list becomes : 3 -> NULL
 */
public class Reverse_Linked_List {

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
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
