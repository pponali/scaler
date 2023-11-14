package com.practice.day4;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description Given a number A. Return 1 if A is prime and return 0 if not.
 * <p>
 * Note : The value of A can cross the range of Integer.
 * <p>
 * <p>
 * Problem Constraints 1 <= A <= 109
 * <p>
 * <p>
 * Input Format The first argument is a single integer A.
 * <p>
 * <p>
 * Output Format Return 1 if A is prime else return 0.
 * <p>
 * <p>
 * Example Input Input 1: A = 5 Input 2:
 * <p>
 * A = 10
 * <p>
 * <p>
 * Example Output Output 1: 1 Output 2:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation Explanation 1: 5 is a prime number. Explanation 2:
 * <p>
 * 10 is not a prime number.
 */
public class IsPrime {
    public static void main(String[] args) {
        IsPrime isPrime = new IsPrime();
        System.out.println(isPrime.isPrime(10));
    }
    public boolean isPrime(int A){
         int count = 0;
        for(int i = 1; i <= A; i++){
            if(A % i == 0){
                count++;
            }
        }
        return count == 2;
    }

}
