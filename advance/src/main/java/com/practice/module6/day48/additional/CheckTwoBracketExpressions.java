package com.practice.module6.day48.additional;

import java.util.Stack;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 09/12/23
 * @Description Given two strings A and B. Each string represents an expression consisting of lowercase English
 * alphabets, '+', '-', '(' and ')'.
 * <p></p>
 * The task is to compare them and check if they are similar. If they are identical, return 1 else, return 0.
 * <p></p>
 * NOTE: It may be assumed that there are at most 26 operands from ‘a’ to ‘z’, and every operand appears only once.
 * <p></p>
 * <p>
 * <p>
 * Problem Constraints 1 <= length of the each String <= 100
 * <p></p>
 * <p>
 * <p>
 * Input Format The given arguments are string A and string B.
 * <p></p>
 * <p>
 * <p>
 * Output Format Return 1 if they represent the same expression else return 0.
 * <p></p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p></p>
 * A = "-(a+b+c)" B = "-a-b-c" Input 2:
 * <p></p>
 * A = "a-b-(c-d)" B = "a-b-c-d"
 * <p></p>
 * <p>
 * Example Output Output 1:
 * <p></p>
 * 1 Output 2:
 * <p></p>
 * 0
 * <p></p>
 * <p>
 * Example Explanation Explanation 1:
 * <p></p>
 * The expression "-(a+b+c)" can be written as "-a-b-c" which is equal as B. Explanation 2:
 * <p>
 * Both the expression are different.
 */
public class CheckTwoBracketExpressions {

    Stack<Character> stack = new Stack<>();
    public int solve(String A, String B) {
        return simplifyExpression(A).equals(simplifyExpression(B)) ? 1 : 0;
    }

    public String simplifyExpression(String A){
        char[] chars = A.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char ch : chars){
            if(ch == '('){
                stack.push(ch);
            } else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    stringBuilder.append(stack.pop());
                }
                stack.pop();
            } else {
                while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())){
                    stringBuilder.append(stack.pop());
                }
                stack.push(ch);
            }
            stringBuilder.append(ch);
            System.out.println(stringBuilder.toString());
            System.out.println(stack);

        }
        while(!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();

    }

    private int precedence(char ch) {
        return 1;

    }


}
