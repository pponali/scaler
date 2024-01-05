package com.ajet.module6.day45.additional;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description Given a singly linked list A and an integer B, reverse the nodes of the list B at a time and return the
 * modified linked list.
 * <p></p>
 * <p>
 * <p>
 * Problem Constraints 1 <= |A| <= 103
 * <p></p>
 * B always divides A
 * <p></p>
 * <p>
 * <p>
 * Input Format The first argument of input contains a pointer to the head of the linked list.
 * <p></p>
 * The second arugment of input contains the integer, B.
 * <p></p>
 * <p>
 * <p>
 * Output Format Return a pointer to the head of the modified linked list.
 * <p></p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p></p>
 * A = [1, 2, 3, 4, 5, 6] B = 2 Input 2:
 * <p></p>
 * A = [1, 2, 3, 4, 5, 6] B = 3
 * <p></p>
 * <p>
 * Example Output Output 1:
 * <p></p>
 * [2, 1, 4, 3, 6, 5] Output 2:
 * <p></p>
 * [3, 2, 1, 6, 5, 4]
 * <p></p>
 * <p>
 * Example Explanation Explanation 1:
 * <p></p>
 * For the first example, the list can be reversed in groups of 2. [[1, 2], [3, 4], [5, 6]] After reversing the K-linked
 * list [[2, 1], [4, 3], [6, 5]] Explanation 2:
 * <p></p>
 * For the second example, the list can be reversed in groups of 3. [[1, 2, 3], [4, 5, 6]] After reversing the K-linked
 * list [[3, 2, 1], [6, 5, 4]]
 */
public class K_reverse_linked_list {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
        k_reverse_linked_list(head, 4);
    }

    public static ListNode k_reverse_linked_list(ListNode head, int k) {
        //reverse the linked list till k th node.
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        head.next = curr;
        return prev;
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
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void printList(ListNode head) {
        //print all the element in the list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
            System.out.println();
        }
    }
}
