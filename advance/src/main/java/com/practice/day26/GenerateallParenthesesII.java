package com.practice.day26;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 16/10/23
 * <p>
 * Problem Description Given an integer A pairs of parentheses, write a function to generate all combinations of
 * well-formed parentheses of length 2*A.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= A <= 10
 * <p>
 * <p>
 * <p>
 * Input Format First and only argument is integer A.
 * <p>
 * <p>
 * <p>
 * Output Format Return a sorted list of all possible parenthesis.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = 3 Input 2:
 * <p>
 * A = 1
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * [ "((()))", "(()())", "(())()", "()(())", "()()()" ] Output 2:
 * <p>
 * [ "()" ]
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * All paranthesis are given in the output list. Explanation 2:
 * <p>
 * All paranthesis are given in the output list.
 */
public class GenerateallParenthesesII {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateParenthesis(3)));
    }

    public static String[] generateParenthesis(int A) {
        int left_br = 0, right_br = 0;
        String st = "";
        ArrayList<String> list = new ArrayList<String>();
        generateParenthesis(2 * A, list, st, left_br, right_br);
        return list.stream().toArray(String[]::new);
    }

    public static void generateParenthesis(int length, ArrayList<String> list, String st, int left_br, int right_br) {
        if (st.length() == length) {
            list.add(st);
        }
        if (left_br < length / 2) {
            generateParenthesis(length, list, st + "(", left_br + 1, right_br);
        }

        if (right_br < left_br) {
            generateParenthesis(length, list, st + ")", left_br, right_br + 1);
        }

    }
}
