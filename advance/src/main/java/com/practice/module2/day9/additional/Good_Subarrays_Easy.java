package com.practice.module2.day9.day9.additional;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the
 * criteria: 1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
 * 2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B. Your
 * task is to find the count of good subarrays in A.
 * <p>
 * <p>
 * Problem Constraints 1 <= len(A) <= 103 1 <= A[i] <= 103 1 <= B <= 107
 * <p>
 * <p>
 * Input Format The first argument given is the integer array A. The second argument given is an integer B.
 * <p>
 * <p>
 * Output Format Return the count of good subarrays in A.
 * <p>
 * <p>
 * Example Input Input 1: A = [1, 2, 3, 4, 5] B = 4 Input 2:
 * <p>
 * A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9] B = 65
 * <p>
 * <p>
 * Example Output Output 1: 6 Output 2:
 * <p>
 * 36
 * <p>
 * <p>
 * Example Explanation Explanation 1: Even length good subarrays = {1, 2} Odd length good subarrays = {1, 2, 3}, {1, 2,
 * 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5} Explanation 1: There are 36 good subarrays
 */
public class Good_Subarrays_Easy {
    public static void main(String[] args) {
        Good_Subarrays_Easy goodSubarraysEasy = new Good_Subarrays_Easy();
        System.out.println(goodSubarraysEasy.goodSubarraysEasy(new int[]{1, 2, 3, 4, 5}, 4));
    }

    public int goodSubarraysEasy(int[] A, int B) {
        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        int countOfGoodSubArrays = 0;
        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        int size = 0, sum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                size = j - i + 1;
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }
                if (size % 2 == 0 && sum < B) {
                    countOfGoodSubArrays++;
                }
                if (size % 2 == 1 && sum > B) {
                    countOfGoodSubArrays++;
                }
            }
        }
        return countOfGoodSubArrays;
    }
}
