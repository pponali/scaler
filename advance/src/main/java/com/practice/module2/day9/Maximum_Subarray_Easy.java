package com.practice.module2.day9.day9;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description
 *
 *
 * Problem Description
 * You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
 * But the sum must not exceed B.
 *<p></p>
 *
 * Problem Constraints
 * 1 <= A <= 103
 * 1 <= B <= 109
 * 1 <= C[i] <= 106
 *<p></p>
 *
 * Input Format
 * The first argument is the integer A.
 * The second argument is the integer B.
 * The third argument is the integer array C.
 *<p></p>
 *
 * Output Format
 * Return a single integer which denotes the maximum sum.
 *<p></p>
 *
 * Example Input
 * Input 1:
 * A = 5
 * B = 12
 * C = [2, 1, 3, 4, 5]
 * Input 2:
 *<p></p>
 * A = 3
 * B = 1
 * C = [2, 2, 2]
 *<p></p>
 *
 * Example Output
 * Output 1:
 * 12
 * Output 2:
 *<p></p>
 * 0
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 * We can select {3,4,5} which sums up to 12 which is the maximum possible sum.
 * Explanation 2:
 *<p></p>
 * All elements are greater than B, which means we cannot select any subarray.
 * Hence, the answer is 0.
 */
public class Maximum_Subarray_Easy {

    public static void main(String[] args) {
        Maximum_Subarray_Easy maximumSubarrayEasy = new Maximum_Subarray_Easy();
        System.out.println(maximumSubarrayEasy.maximumSubarrayEasy(new int[]{2, 1, 3, 4, 5}, 12));
    }

    public int maximumSubarrayEasy(int[] A, int B){
        int  max = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = i; j < A.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += A[k];
                    if(sum <= B){
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        return max;

    }
}

