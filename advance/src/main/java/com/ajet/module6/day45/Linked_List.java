package com.ajet.module6.day45;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description Design and implement a Linked List data structure. A node in a linked list should have the following
 * attributes - an integer value and a pointer to the next node.
 * <p></p>
 * It should support the following operations:
 * <p></p>
 * insert_node(position, value) - To insert the input value at the given position in the linked list.
 * delete_node(position) - Delete the value at the given position from the linked list. print_ll() - Print the entire
 * linked list, such that each element is followed by a single space (no trailing spaces). Note:
 * <p></p>
 * If an input position does not satisfy the constraint, no action is required. Each print query has to be executed in a
 * new line.
 * <p></p>
 * <p>
 * Problem Constraints 1 <= value <= 105 1 <= position <= n where, n is the size of the linked-list.
 * <p></p>
 * <p>
 * <p>
 * Input Format First line contains an integer denoting number of cases, let's say t. Next t line denotes the cases.
 * <p></p>
 * <p>
 * Output Format When there is a case of print_ll(), Print the entire linked list, such that each element is followed by
 * a single space.
 * <p></p>
 * There should not be any trailing space.
 * <p></p>
 * NOTE: You don't need to return anything.
 * <p></p>
 * <p>
 * Example Input Input 1: 5 i 1 23 i 2 24 p d 1 p Input 2: 3 i 1 54 d 10 p
 * <p></p>
 * <p>
 * Example Output Output 1: 23 24 24 Output 2: 54
 */
public class Linked_List {
    public static ListNode head = null;

    public static void insert_node(int position, int value) {
        ListNode nn = new ListNode(value);
        if(position == 0) {
            nn.next = head;
            head = nn;
        } else {
            ListNode temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
        }
    }


    /**
     *
     * @param position - position
     */
    public static void delete_node(int position) {
        if(position == 0) {
            head = head.next;
            return;
        }
        for (int i = 0; i < position - 1; i++) {
            head = head.next;
        }
        if(head != null && head.next != null) {
            head.next = head.next.next;
        }
    }

    /**
     * Print the entire linked list, such that each element is followed by a single space (no trailing spaces). Note:
     * <p></p>
     * If an input position does not satisfy the constraint, no action is required. Each print query has to be executed in a
     * new line.
     *
     */
    public static void print_ll() {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }


    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     public int val;
     *     public ListNode next;
     *     ListNode(int x) { val = x; next = null; }
     * }
     */
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
