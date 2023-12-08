package com.practice.module2.day7.additional;

import java.util.Arrays;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description Given an array A of N integers. Construct prefix sum of the array in the given array itself.
 * <p>
 * <p>
 * Problem Constraints 1 <= N <= 105 1 <= A[i] <= 103
 * <p>
 * <p>
 * Input Format Only argument A is an array of integers.
 * <p>
 * <p>
 * Output Format Return an array of integers denoting the prefix sum of the given array.
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = [1, 2, 3, 4, 5] Input 2:
 * <p>
 * A = [4, 3, 2]
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * [1, 3, 6, 10, 15] Output 2:
 * <p>
 * [4, 7, 9]
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * The prefix sum array of [1, 2, 3, 4, 5] is [1, 3, 6, 10, 15]. Explanation 2:
 * <p>
 * The prefix sum array of [4, 3, 2] is [4, 7, 9].
 */
public class In_place_Prefix_Sum {

    public static void main(String[] args) {
        In_place_Prefix_Sum inPlacePrefixSum = new In_place_Prefix_Sum();
        int[] array = new int[]{1,2,3,4,5};
        inPlacePrefixSum.inPlacePrefixSum(array);
        System.out.println(Arrays.toString(array));
    }

    public void inPlacePrefixSum(int[] A){
        for(int i = 1;i < A.length; i++){
            A[i]  = A[i - 1] + A[i];
        }
    }
}
