package com.practice.module6.day48.additional;

import java.util.Stack;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 09/12/23
 * @Description
 *
 * Given a string A denoting an expression. It contains the following operators '+', '-', '*', '/'.
 *<p></p>
 * Check whether A has redundant braces or not.
 *<p></p>
 * NOTE: A will be always a valid expression and will not contain any white spaces.
 *<p></p>
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 *<p></p>
 *
 *
 * Input Format
 * The only argument given is string A.
 *<p></p>
 *
 *
 * Output Format
 * Return 1 if A has redundant braces else, return 0.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *  A = "((a+b))"
 * Input 2:
 *<p></p>
 *  A = "(a+(a+b))"
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
 *  ((a+b)) has redundant braces so answer will be 1.
 * Explanation 2:
 *
 *  (a+(a+b)) doesn't have any redundant braces so answer will be 0.
 */
public class RedundantBraces {

    Stack<Character> stack = new Stack<>();

    public int braces(String A) {
        char[] chars = A.toCharArray();
        for(char ch : chars){
            if(!Character.isLetterOrDigit(ch)){
                if(ch == ')' && stack.peek() == ')'){
                    int count =0;
                    while(!stack.isEmpty()){
                        if(stack.peek() == '('){
                            count++;
                        } else {
                            count--;
                        }
                        stack.pop();
                        if(!stack.isEmpty() && (stack.peek() == '(') && count == 1) {
                            return 1;
                        } else {
                            break;
                        }
                    }
                } else {
                    stack.push(ch);
                }
            }
        }
        return 0;
    }
}
