package com.practice.day45.additional;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description
 *
 * Given a linked list A, remove the B-th node from the end of the list and return its head. For example, Given linked list: 1->2->3->4->5, and B = 2. After removing the second node from the end, the linked list becomes 1->2->3->5. NOTE: If B is greater than the size of the list, remove the first node of the list. NOTE: Try doing it using constant additional space.
 *<p></p>
 *
 * Problem Constraints
 * 1 <= |A| <= 106
 *<p></p>
 *
 * Input Format
 * The first argument of input contains a pointer to the head of the linked list. The second argument of input contains the integer B.
 *<p></p>
 *
 * Output Format
 * Return the head of the linked list after deleting the B-th element from the end.
 *<p></p>
 *
 * Example Input
 * Input 1:
 * A = 1->2->3->4->5
 * B = 2
 * Input 2:
 * A = 1
 * B = 1
 *<p></p>
 *
 * Example Output
 * Output 1:
 * 1->2->3->5
 * Output 2:
 *<p></p>
 *
 *
 * Example Explanation
 * Explanation 1:
 * In the first example, 4 is the second last element.
 * Explanation 2:
 * In the second example, 1 is the first and the last element.
 */

@Slf4j
public class Remove_Nth_Node_from_List_End {


    public static Node removeNthNode(Node head, int k) {
        // remove k th node from the end of the list
        int length = 0;
        Node curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        int index = length - k;
        curr = head;
        int count = 0;
        while(curr != null){
            if(count == index){
                curr.next = curr.next.next;
            }
            count++;
            curr = curr.next;
        }
        return head;
    }

    public static void printList(Node head) {
        while(head != null){
            log.info(head + " ");
            head =  head.next;
        }

    }

    public static class Node{
        int val;
        Node next = null;

        public Node(int i) {
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
