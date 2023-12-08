package com.practice.module3.day12.day12;

import java.util.Stack;
//TODO need to revise.
/**
 *
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 *
 * You are given a string A of size N.
 *
 * Return the string A after reversing the string word by word.
 *
 * NOTE:
 *
 * A sequence of non-space characters constitutes a word.
 * Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
 * If there are multiple spaces between words, reduce them to a single space in the reversed string.
 *
 *
 * Problem Constraints
 * 1 <= N <= 3 * 105
 *
 *
 *
 * Input Format
 * The only argument given is string A.
 *
 *
 *
 * Output Format
 * Return the string A after reversing the string word by word.
 *
 *
 *
 * Example Input
 * Input 1:
 * A = "the sky is blue"
 * Input 2:
 * A = "this is ib"
 *
 *
 * Example Output
 * Output 1:
 * "blue is sky the"
 * Output 2:
 * "ib is this"
 *
 *
 * Example Explanation
 * Explanation 1:
 * We reverse the string word by word so the string becomes "blue is sky the".
 * Explanation 2:
 * We reverse the string word by word so the string becomes "ib is this".
 */
public class Reverse_the_String {



    public String solve(String A) {

        Stack<String> st = new Stack<>();
        for(int i=0;i<A.length();i++){
            String word="";
            while(A.charAt(i)!=' ' && i<A.length()){
                word+=A.charAt(i);
                i++;
            }
            if(word.equals("")){
                continue;
            }
            st.push(word);
        }
        String ans="";
        while(!st.empty()){
            ans+=st.peek();
            st.pop();

            if(st.empty()){
                continue;
            }
            ans+=" ";
        }
        return ans;

    }
}
