package com.practice.module3.day12.day12;
//TODO need to revise.
/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 *
 *
 * Given a string A of size N, find and return the longest palindromic substring in A.
 *
 * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
 *
 * Palindrome string:
 * A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
 *
 * Incase of conflict, return the substring which occurs first ( with the least starting index).
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 6000
 *
 *
 *
 * Input Format
 * First and only argument is a string A.
 *
 *
 *
 * Output Format
 * Return a string denoting the longest palindromic substring of string A.
 *
 *
 *
 * Example Input
 * Input 1:
 * A = "aaaabaaa"
 * Input 2:
 * A = "abba
 *
 *
 * Example Output
 * Output 1:
 * "aaabaaa"
 * Output 2:
 * "abba"
 *
 *
 * Example Explanation
 * Explanation 1:
 * We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
 * Explanation 2:
 * We can see that longest palindromic substring is of length 4 and the string is "abba".
 */
public class Longest_Palindromic_Substring {

    public String expandAroundCenter(String s, int c1, int c2) {
        int l = c1, r = c2;
        int n = s.length();
        while (l >= 0 && r <= n - 1 && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
    public String longestPalindrome(String A) {
        int n = A.length();
        if (n == 0)
            return "";
        String longest = A.substring(0, 1); // a single char itself is a palindrome
        for (int i = 0; i < n - 1; i++) {
            String p1 = expandAroundCenter(A, i, i);
            if (p1.length() > longest.length())
                longest = p1;
            String p2 = expandAroundCenter(A, i, i + 1);
            if (p2.length() > longest.length())
                longest = p2;
        }
        return longest;
    }
}
