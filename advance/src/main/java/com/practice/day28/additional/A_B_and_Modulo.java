package com.practice.day28.additional;

/**
 * @author prakashponali
 * @Date 11/11/23
 *
 * <p>
 * Problem Description Given two integers A and B, find the greatest possible positive integer M, such that A % M = B %
 * M.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= A, B <= 109 A != B
 * <p>
 * <p>
 * <p>
 * Input Format The first argument is an integer A. The second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format Return an integer denoting the greatest possible positive M.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = 1 B = 2 Input 2:
 * <p>
 * A = 5 B = 10
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 1 Output 2:
 * <p>
 * 5
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * 1 is the largest value of M such that A % M == B % M. Explanation 2:
 * <p>
 * For M = 5, A % M = 0 and B % M = 0.
 * <p>
 * No value greater than M = 5, satisfies the condition.
 */
public class A_B_and_Modulo {

    public static void main(String[] args) {

    }

    public int solve(int A, int B) {
        return Math.abs(A - B);
    }

    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
