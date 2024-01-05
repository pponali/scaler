package com.ajet.module6.day48.additional;

import java.util.Stack;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 09/12/23
 * @Description Given string A denoting an infix expression. Convert the infix expression into a postfix expression.
 * String A consists of ^, /, *, +, -, (, ) and lowercase English alphabets where lowercase English alphabets are
 * operands and ^, /, , +, - are operators. Find and return the postfix expression of A. NOTE: ^ has the highest
 * precedence. / and * have equal precedence but greater than + and -. + and - have equal precedence and lowest
 * precedence among given operators. Problem Constraints 1 <= length of the string <= 500000 Input Format The only
 * argument given is string A. Output Format Return a string denoting the postfix conversion of A. Example Input Input
 * 1: A = "x^y/(a*z)+b" Input 2: A = "a+b*(c^d-e)^(f+g*h)-i" Example Output Output 1: "xy^az*b+" Output 2:
 * "abcd^e-fgh*+^*+i-" Example Explanation Explanation 1: Output denotes the postfix expression of the given input.
 */


public class InfixToPostfix {

    Stack<Character> stack = new Stack<>();

    public String solve(String A) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = A.toCharArray();
        for (char ch : chars) {
            if(Character.isLetterOrDigit(ch)){
                stringBuilder.append(ch);
            } else if(ch == '('){
                stack.push(ch);
            }  else if(ch == ')'){
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
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();

    }

    public int precedence(char ch) {
        return 1;
    }

}
