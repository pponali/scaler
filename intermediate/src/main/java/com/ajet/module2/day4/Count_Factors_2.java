package com.ajet.module2.day4;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description Problem Description Given an integer A, you need to find the count of it's factors.
 * <p>
 * Factor of a number is the number which divides it perfectly leaving no remainder.
 * <p>
 * Example : 1, 2, 3, 6 are factors of 6
 * <p>
 * <p>
 * Problem Constraints 1 <= A <= 109
 * <p>
 * <p>
 * Input Format First and only argument is an integer A.
 * <p>
 * <p>
 * Output Format Return the count of factors of A.
 * <p>
 * <p>
 * Example Input Input 1: 5 Input 2: 10
 * <p>
 * <p>
 * Example Output Output 1: 2 Output 2: 4
 * <p>
 * <p>
 * Example Explanation Explanation 1: Factors of 5 are 1 and 5. Explanation 2: Factors of 10 are 1, 2, 5 and 10.
 */
public class Count_Factors_2 {

    public static void main(String[] args) {
        Count_Factors_2 countFactors2 = new Count_Factors_2();
        System.out.println(countFactors2.countOfFactors(10));
    }

    public int countOfFactors(int A){
        int count = 0;
        for(int i = 1; i <= A; i ++){
            if(A % i == 0){
                count++;
            }
        }
        return count;

    }


}
