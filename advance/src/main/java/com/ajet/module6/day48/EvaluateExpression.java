package com.ajet.module6.day48;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 08/12/23
 * @Description
 */
public class EvaluateExpression {
    Stack stack = new Stack();

    public int evalRPN(String[] A) {

        for (String str : A) {

            int operand1 = 0;
            int operand2 = 0;
            int result = 0;
            if (str.equals("/")) {
                operand1 = stack.peak();
                stack.pop();
                operand2 = stack.peak();
                stack.pop();
                result = operand2 / operand1;
                stack.push(result);
            } else if (str.equals("*")) {
                operand1 = stack.peak();
                stack.pop();
                operand2 = stack.peak();
                stack.pop();
                result = operand2 * operand1;
                stack.push(result);
            } else if (str.equals("+")) {
                operand1 = stack.peak();
                stack.pop();
                operand2 = stack.peak();
                stack.pop();
                result = operand2 + operand1;
                stack.push(result);
            } else if (str.equals("-")) {
                operand1 = stack.peak();
                stack.pop();
                operand2 = stack.peak();
                stack.pop();
                result = operand2 - operand1;
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.head.val;
    }


    public static class Stack {
        public ListNode head;

        int top = -1;

        public void push(int data) {
            ListNode nn = new ListNode(data);
            if (head != null) {
                nn.next = head;
            }
            head = nn;
            top++;
        }

        public void pop() {
            if (head != null) {
                head = head.next;
            }
            top--;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public int peak() {
            return head != null ? head.val : -1;
        }

        public static class ListNode {
            public int val;
            public ListNode next;

            public ListNode() {

            }

            public ListNode(int val) {
                this.val = val;
            }
        }
    }
}