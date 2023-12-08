package com.practice.module6.day45;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description
 *
 * Given a singly linked list A, determine if it's a palindrome. Return 1 or 0, denoting if it's a palindrome or not, respectively.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 *
 *
 *
 * Input Format
 * The first and the only argument of input contains a pointer to the head of the given linked list.
 *
 *
 *
 * Output Format
 * Return 0, if the linked list is not a palindrome.
 *<p></p>
 * Return 1, if the linked list is a palindrome.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 * A = [1, 2, 2, 1]
 * Input 2:
 *<p></p>
 * A = [1, 3, 2]
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  1
 * Output 2:
 *<p></p>
 *  0
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 *  The first linked list is a palindrome as [1, 2, 2, 1] is equal to its reversed form.
 * Explanation 2:
 *
 *  The second linked list is not a palindrome as [1, 3, 2] is not equal to [2, 3, 1].
 */


public class Palindrome_List {

    public static void main(String[] args) {
        ListNode head = new Palindrome_List().new ListNode(1);
        head.next = new Palindrome_List().new ListNode(2);
        head.next.next = new Palindrome_List().new ListNode(2);
        head.next.next.next = new Palindrome_List().new ListNode(1);
        System.out.println(new Palindrome_List().lPalin(head));
    }

    public int lPalin(ListNode A) {
        ListNode head = A;
        ListNode temp = A;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int half = count / 2;
        int i = 0;
        temp = head;
        while(i < half){
            temp = temp.next;
            i++;
        }
        temp = reverse(temp);
        while(temp != null){
            if(temp.val != head.val) return 0;
            temp = temp.next;
            head = head.next;
        }
        return 1;
    }

    public ListNode reverse(ListNode A) {
        ListNode head = A;
        ListNode next = null;
        ListNode pre = null;
        ListNode current = head;
        while(current != null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    public class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

}
