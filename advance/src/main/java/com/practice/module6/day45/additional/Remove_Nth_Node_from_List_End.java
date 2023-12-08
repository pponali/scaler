package com.practice.module6.day45.additional;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description Given a linked list A, remove the B-th node from the end of the list and return its head. For example,
 * Given linked list: 1->2->3->4->5, and B = 2. After removing the second node from the end, the linked list becomes
 * 1->2->3->5. NOTE: If B is greater than the size of the list, remove the first node of the list. NOTE: Try doing it
 * using constant additional space.
 * <p></p>
 * <p>
 * Problem Constraints 1 <= |A| <= 106
 * <p></p>
 * <p>
 * Input Format The first argument of input contains a pointer to the head of the linked list. The second argument of
 * input contains the integer B.
 * <p></p>
 * <p>
 * Output Format Return the head of the linked list after deleting the B-th element from the end.
 * <p></p>
 * <p>
 * Example Input Input 1: A = 1->2->3->4->5 B = 2 Input 2: A = 1 B = 1
 * <p></p>
 * <p>
 * Example Output Output 1: 1->2->3->5 Output 2:
 * <p></p>
 * <p>
 * <p>
 * Example Explanation Explanation 1: In the first example, 4 is the second last element. Explanation 2: In the second
 * example, 1 is the first and the last element.
 */

@Slf4j
public class Remove_Nth_Node_from_List_End {


    public static ListNode removeNthNode(ListNode A, int B) {
        // remove k th node from the end of the list
        int length = 0;
        ListNode curr = A;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        int index = length - B;
        if(index == 0){
            return A.next;
        }
        curr = A;
        int count = 1;
        if(length < B){
            A = A.next;
        }
        while (curr != null) {
            if (count == index && curr.next != null) {
                curr.next = curr.next.next;
            }
            count++;
            curr = curr.next;
        }
        return A;
    }

    public static void printList(ListNode head) {
            log.info(head + " ");

    }

    public static class ListNode {
        int val;
        public ListNode next = null;

        public ListNode(int i) {
            val = i;
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
