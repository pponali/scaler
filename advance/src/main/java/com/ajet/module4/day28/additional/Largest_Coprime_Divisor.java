package com.ajet.module4.day28.additional;


/**
 * @author prakashponali
 * @Date 20/10/23
 * <p>
 * Problem Description
 * <p>
 * You are given two positive numbers A and B . You need to find the maximum valued integer X such that:
 * <p>
 * X divides A i.e. A % X = 0 X and B are co-prime i.e. gcd(X, B) = 1
 * <p>
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= A, B <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * <p>
 * First argument is an integer A. Second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * <p>
 * Return an integer maximum value of X as descibed above.
 * <p>
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * <p>
 * A = 30 B = 12 Input 2:
 * <p>
 * A = 5 B = 10
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1:
 * <p>
 * 5 Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * <p>
 * Explanation 1:
 * <p>
 * All divisors of A are (1, 2, 3, 5, 6, 10, 15, 30). The maximum value is 5 such that A%5 == 0 and gcd(5,12) = 1
 * Explanation 2:
 * <p>
 * 1 is the only value such that A%5 == 0 and gcd(1,10) = 1
 */

public class Largest_Coprime_Divisor {

    public static void main(String[] args) {
        System.out.println(cpFact(25, 7));
    }

    public static int cpFact(int A, int B) {
        while (gcd(A, B) != 1) {
            A = A / gcd(A, B);
        }
        return A;
    }

    public static int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A % B);
    }
}
