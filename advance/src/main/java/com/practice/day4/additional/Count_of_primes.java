package com.practice.day4.additional;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description You will be given an integer n. You need to return the count of prime numbers less than or equal to n.
 * <p>
 * <p>
 * Problem Constraints 0 <= n <= 10^3
 * <p>
 * <p>
 * Input Format Single input parameter n in function.
 * <p>
 * <p>
 * Output Format Return the count of prime numbers less than or equal to n.
 * <p>
 * <p>
 * Example Input Input 1: 19 Input 2: 1
 * <p>
 * <p>
 * Example Output Output 1: 8 Output 2: 0
 * <p>
 * <p>
 * Example Explanation Explanation 1: Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19 Explanation 2: There are no primes <=
 * 1
 */
public class Count_of_primes {
    public static void main(String[] args) {

        Count_of_primes countOfPrimes = new Count_of_primes();
        System.out.println(countOfPrimes.countPrimes(10));

    }

    /**
     *
     * @param A
     * @return
     */
    public int countPrimes(int A) {
        int count = 0;
        for (int i = 2; i <= A; i++) {
            int countDivisors = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countDivisors++;
                }
            }
            if (countDivisors == 2) {
                count++;
            }
        }
        return count;
    }


}
