package com.practice.module6.day48;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 08/12/23
 * @Description Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are
 * correct in A.
 * <p></p>
 * Refer to the examples for more clarity.
 * <p></p>
 * <p>
 * <p>
 * Problem Constraints 1 <= |A| <= 100
 * <p></p>
 * <p>
 * <p>
 * Input Format The first and the only argument of input contains the string A having the parenthesis sequence.
 * <p></p>
 * <p>
 * <p>
 * Output Format Return 0 if the parenthesis sequence is not balanced.
 * <p></p>
 * Return 1 if the parenthesis sequence is balanced.
 * <p></p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p></p>
 * A = {([])} Input 2:
 * <p></p>
 * A = (){ Input 3:
 * <p></p>
 * A = ()[]
 * <p></p>
 * <p>
 * Example Output Output 1:
 * <p></p>
 * 1 Output 2:
 * <p></p>
 * 0 Output 3:
 * <p></p>
 * 1
 * <p></p>
 * <p>
 * Example Explanation You can clearly see that the first and third case contain valid parenthesis.
 * <p></p>
 * In the second case, there is no closing bracket for {, thus the parenthesis sequence is invalid.
 */
public class BalancedParenthesis {

    Stack stack = new Stack();

    public int solve(String A) {
        char[] chars = A.toCharArray();
        for (char ch : chars) {
            if (ch == ')') {
                if (stack.peak() != '(') {
                    return 0;
                } else {
                    stack.pop();
                }
            } else if (ch == '}') {
                if (stack.peak() != '{') {
                    return 0;
                } else {
                    stack.pop();
                }
            } else if (ch == ']') {
                if (stack.peak() != '[') {
                    return 0;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        if (stack.top == -1) {
            return 1;
        } else {
            return 0;
        }
    }


    public static class Stack {

        ListNode head;
        int top = -1;

        public void push(char data) {
            ListNode nn = new ListNode(data);
            nn.next = head;
            head = nn;
            top++;
        }

        public void pop() {
            if (head != null)
                head = head.next;
            top--;
        }

        public int peak() {
            return head != null ? head.val : 0;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public class ListNode {
            char val;
            ListNode next;
            public ListNode() {
            }
            public ListNode(char val) {
                this.val = val;
            }

        }
    }

}
