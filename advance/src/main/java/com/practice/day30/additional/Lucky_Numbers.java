package com.practice.day30.additional;

import java.util.HashMap;

/**
 * @Author prakashponali
 * @Date 11/11/23
 * @Description Problem Description A lucky number is a number that has exactly 2 distinct prime divisors.
 * <p>
 * You are given a number A, and you need to determine the count of lucky numbers between the range 1 to A (both
 * inclusive).
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= A <= 50000
 * <p>
 * <p>
 * <p>
 * Input Format The first and only argument is an integer A.
 * <p>
 * <p>
 * <p>
 * Output Format Return an integer i.e the count of lucky numbers between 1 and A, both inclusive.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = 8 Input 2:
 * <p>
 * A = 12
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 1 Output 2:
 * <p>
 * 3
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * Between [1, 8] there is only 1 lucky number i.e 6. 6 has 2 distinct prime factors i.e 2 and 3. Explanation 2:
 * <p>
 * Between [1, 12] there are 3 lucky number: 6, 10 and 12.
 */
public class Lucky_Numbers {

    public static void main(String[] args) {
        Lucky_Numbers luckyNumbers = new Lucky_Numbers();
        System.out.println(luckyNumbers.solve(8));
    }

    public int solve(int A) {
        int[] ints = new int[A + 1];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }
        for (int i = 2; i * i <= ints.length; i++) {
            if (ints[i] != i) {
                continue;
            }
            for (int j = i * i; j < ints.length; j = j + i) {
                ints[j] = i;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 2; i < A; i++) {
            int n = i;
            while (n > 1) {
                int smallestPrimeFactor = ints[n];
                map.put(smallestPrimeFactor, map.getOrDefault(smallestPrimeFactor, 0) + 1);
                n = n / smallestPrimeFactor;
            }
            if (map.keySet().size() == 2) {
                count++;
            }
            map.clear();
        }
        return count;

    }
}
