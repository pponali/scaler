package com.practice.day9.additional;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 *
 * Given an array A of N non-negative numbers and a non-negative number B,
 * you need to find the number of subarrays in A with a sum less than B.
 * We may assume that there is no overflow.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 103
 *
 * 1 <= A[i] <= 1000
 *
 * 1 <= B <= 107
 *
 *
 *
 * Input Format
 * First argument is an integer array A.
 *
 * Second argument is an integer B.
 *
 *
 *
 * Output Format
 * Return an integer denoting the number of subarrays in A having sum less than B.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [2, 5, 6]
 *  B = 10
 * Input 2:
 *
 *  A = [1, 11, 2, 3, 15]
 *  B = 10
 *
 *
 * Example Output
 * Output 1:
 *
 *  4
 * Output 2:
 *
 *  4
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  The subarrays with sum less than B are {2}, {5}, {6} and {2, 5},
 * Explanation 2:
 *
 *  The subarrays with sum less than B are {1}, {2}, {3} and {2, 3}
 */
public class Counting_Subarrays_Easy {

    public static void main(String[] args) {
        Counting_Subarrays_Easy countingSubarraysEasy = new Counting_Subarrays_Easy();
        System.out.println(countingSubarraysEasy.countingSubarraysEasy(new int[]{2, 5, 6}, 10));
        System.out.println(countingSubarraysEasy.countingSubarraysEasy(new int[]{1, 11, 2, 3, 15}, 10));
        System.out.println(countingSubarraysEasy.countingSubarraysEasy(new int[]{1, 2, 3, 4, 5, 6}, 10));
    }

    public int countingSubarraysEasy(int[] A, int B){
        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        for(int i = 1; i < A.length; i++){
            prefix[i] = A[i] + prefix[i - 1];
        }
        int count = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = i; j < A.length; j++) {
                if (i == 0) {
                    if (prefix[j] < B) count++;
                }
                else {
                    if(prefix[j] - prefix[i - 1] < B) count++;
                }
            }
        }
        return count;

    }

}
