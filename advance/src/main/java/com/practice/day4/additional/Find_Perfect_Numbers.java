package com.practice.day4.additional;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description Problem Description You are given an integer A. You have to tell whether it is a perfect number or not.
 * <p>
 * Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
 * <p>
 * A proper divisor of a natural number is the divisor that is strictly less than the number.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= A <= 106
 * <p>
 * <p>
 * <p>
 * Input Format First and only argument contains a single positive integer A.
 * <p>
 * <p>
 * <p>
 * Output Format Return 1 if A is a perfect number and 0 otherwise.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = 4 Input 2:
 * <p>
 * A = 6
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 0 Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * For A = 4, the sum of its proper divisors = 1 + 2 = 3, is not equal to 4. Explanation 2:
 * <p>
 * For A = 6, the sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
 */
public class Find_Perfect_Numbers {
    public static void main(String[] args) {
        Find_Perfect_Numbers findPerfectNumbers = new Find_Perfect_Numbers();
        System.out.println(findPerfectNumbers.isPerfectNumber(6));

    }

    /**
     *
     * @param A
     * @return
     */
    public int isPerfectNumber(int A) {
        int sum = 0, mod;
        for (int i = 1; i <= A/2; i++) {
            mod = A % i;
            if (mod == 0)
                sum += i;
        }
        return (sum == A) ? 1 : 0;
    }

}
