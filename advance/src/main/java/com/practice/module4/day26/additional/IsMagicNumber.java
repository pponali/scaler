package com.practice.module4.day26.additional;

/**
 * @author prakashponali
 * @Date 17/10/23
 * <p>
 * Problem Description Given a number A, check if it is a magic number or not.
 * <p>
 * A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by
 * adding the sum of the digits after every addition. If the single digit comes out to be 1, then the number is a magic
 * number.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= A <= 109
 * <p>
 * <p>
 * <p>
 * Input Format The first and only argument is an integer A.
 * <p>
 * <p>
 * <p>
 * Output Format Return an 1 if the given number is magic else return 0.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = 83557 Input 2:
 * <p>
 * A = 1291
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 1 Output 2:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * Sum of digits of (83557) = 28 Sum of digits of (28) = 10 Sum of digits of (10) = 1. Single digit is 1, so it's a
 * magic number. Return 1. Explanation 2:
 * <p>
 * Sum of digits of (1291) = 13 Sum of digits of (13) = 4 Single digit is not 1, so it's not a magic number. Return 0.
 */
public class IsMagicNumber {

    public static void main(String[] args) {
        System.out.println(solve(11));
    }

    public static int solve(int A) {
        return sum(A);

    }

    public static int sum(int A) {
        if (A < 10) {
            if (A == 1) {
                return 1;
            } else
                return 0;
        }
        int sum = 0;
        while (A != 0) {
            sum += A % 10;
            A /= 10;
        }

        return sum(sum);
    }
}
