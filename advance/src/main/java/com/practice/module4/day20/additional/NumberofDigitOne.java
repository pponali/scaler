package com.practice.module4.day20.additional;

/**
 * @Author prakashponali (@pponali)
 * @Date 30/12/23 5:58 am
 * @Description :
 * <p></p>
 * Given an integer A, find and return the total number of digit 1 appearing in all non-negative integers less than or equal to A.
 *<p></p>
 *
 *
 * Problem Constraints
 * 0 <= A <= 109
 *<p></p>
 *
 *
 * Input Format
 * The only argument given is the integer A.
 *<p></p>
 *
 *
 * Output Format
 * Return the total number of digit 1 appearing in all non-negative integers less than or equal to A.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *  A = 10
 * Input 2:
 *<p></p>
 *  A = 11
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  2
 * Output 2:
 *<p></p>
 *  4
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 * Digit 1 appears in 1 and 10 only and appears one time in each. So the answer is 2.
 * Explanation 2:
 *
 * Digit 1 appears in 1(1 time) , 10(1 time) and 11(2 times) only. So the answer is 4.
 */
public class NumberofDigitOne {

    public int solve(int A) {
        int n = A;
        int count = 0;
        for(int i = 1; i <= n; i *= 10) {
            int divider = i * 10;
            count += (n / divider) * i + Math.min(Math.max(n % divider - (i - 1), 0), i);
        }
        return count;
    }
}
