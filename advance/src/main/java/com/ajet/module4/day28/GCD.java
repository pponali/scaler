package com.ajet.module4.day28;

/**
 * @author prakashponali
 * @Date 20/10/23
 * <p>
 * Problem Description Given 2 non-negative integers A and B, find gcd(A, B)
 * <p>
 * GCD of 2 integers A and B is defined as the greatest integer 'g' such that 'g' is a divisor of both A and B. Both A
 * and B fit in a 32 bit signed integer.
 * <p>
 * Note: DO NOT USE LIBRARY FUNCTIONS.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 0 <= A, B <= 109
 * <p>
 * <p>
 * <p>
 * Input Format First argument is an integer A. Second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format Return an integer denoting the gcd(A, B).
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = 4 B = 6 Input 2:
 * <p>
 * A = 6 B = 7
 */
public class GCD {

    public static void main(String[] args) {
        System.out.println(gcd(33, 22));
        System.out.println(gcd(6816621, 8157697));

        System.out.println(6816621 % 111241);
        System.out.println(8157697 % 111241);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
