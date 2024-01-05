package com.ajet.module6.day48;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 09/12/23
 * @Description
 *
 * You have a string, denoted as A.
 *<p></p>
 * To transform the string, you should perform the following operation repeatedly:
 * Identify the first occurrence of consecutive identical pairs of characters within the string.
 * Remove this pair of identical characters from the string.
 * Repeat steps 1 and 2 until there are no more consecutive identical pairs of characters.
 * The final result will be the transformed string.
 *<p></p>
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 *<p></p>
 *
 *
 * Input Format
 * First and only argument is string A.
 *<p></p>
 *
 *
 * Output Format
 * Return the final string.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *  A = "abccbc"
 * Input 2:
 *<p></p>
 *  A = "ab"
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  "ac"
 * Output 2:
 *<p></p>
 *  "ab"
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 * The Given string is "abccbc".
 *<p></p>
 * Remove the first occurrence of consecutive identical pairs of characters "cc".
 * After removing the string will be "abbc".
 *<p></p>
 * Again Removing the first occurrence of consecutive identical pairs of characters "bb".
 * After remvoing, the string will be "ac".
 *<p></p>
 * Now, there is no consecutive identical pairs of characters.
 * Therefore the string after this operation will be "ac".
 * Explanation 2:
 *
 *  No removals are to be done.
 */
public class DoubleCharacterTrouble {

    public String solve(String A) {
        char[] chars = A.toCharArray();
        for(char ch : chars){
            if(Stack.isEmpty() || Stack.peak() != ch) {
                Stack.push(ch);
            } else {
                Stack.pop();
            }
        }
        return Stack.reverse();
    }

    public static class Stack{

        public static ListNode head = null;
        public static int top = -1;

        public static void push(char ch){
            ListNode nn = new ListNode(ch);
            if(head != null){
                nn.next = head;
            }
            head = nn;
            top++;
        }

        public static void pop(){
            head = head.next;
            top--;
        }

        public static boolean isEmpty(){
            return head == null;
        }
        public static char peak(){
            return head != null ? head.val : '0';
        }

        public static String reverse(){
            StringBuilder stringBuilder = new StringBuilder();
            ListNode temp = head;
            while(temp != null){
                stringBuilder.append(temp.val);
                temp = temp.next;
            }
           return stringBuilder.reverse().toString();
        }
        public static class ListNode{
            char val;
            ListNode next;
            public ListNode(){}
            public ListNode(char ch){val = ch;}
        }
    }
}
