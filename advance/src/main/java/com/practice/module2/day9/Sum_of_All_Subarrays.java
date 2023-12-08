package com.practice.module2.day9.day9;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description Problem Description You are given an integer array A of length N. You have to find the sum of all
 * subarray sums of A. More formally, a subarray is defined as a contiguous part of an array which we can obtain by
 * deleting zero or more elements from either end of the array. A subarray sum denotes the sum of all the elements of
 * that subarray.
 * <p></p>
 * Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
 * <p></p>
 * <p>
 * <p>
 * Problem Constraints 1 <= N <= 105 1 <= Ai <= 10 4
 * <p></p>
 * <p>
 * Input Format The first argument is the integer array A.
 * <p></p>
 * <p>
 * Output Format Return a single integer denoting the sum of all subarray sums of the given array.
 * <p></p>
 * <p>
 * Example Input Input 1: A = [1, 2, 3] Input 2:
 * <p></p>
 * A = [2, 1, 3]
 * <p></p>
 * <p>
 * Example Output Output 1: 20 Output 2:
 * <p></p>
 * 19
 * <p></p>
 * <p>
 * Example Explanation Explanation 1: The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3],
 * [1, 2, 3]. Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20 Explanation 2:
 * <p></p>
 * The different subarrays for the given array are: [2], [1], [3], [2, 1], [1, 3], [2, 1, 3]. Their sums are: 2 + 1 + 3
 * + 3 + 4 + 6 = 19
 */
public class Sum_of_All_Subarrays {
    public static void main(String[] args) {
        Sum_of_All_Subarrays sumOfAllSubarrays = new Sum_of_All_Subarrays();
        System.out.println(sumOfAllSubarrays.sumOfAllSubarrays(new int[]{2, 1, 3}));

    }

    public int sumOfAllSubarrays(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            ans += A[i] * (i + 1) * (A.length - i);
        }
        return ans;
        /*int  max = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = i; j < A.length; j++){
                for(int k = i; k <= j; k++){
                    max += A[k];
                }
            }
        }
        return max;*/


    }
}
