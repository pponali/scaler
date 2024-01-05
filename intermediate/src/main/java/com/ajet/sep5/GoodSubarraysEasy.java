package com.ajet.sep5;

/**
 * Q1. Good Subarrays Easy
 * Unsolved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
 * 1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
 * 2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
 * Your task is to find the count of good subarrays in A.
 *
 *
 * Problem Constraints
 * 1 <= len(A) <= 103
 * 1 <= A[i] <= 103
 * 1 <= B <= 107
 *
 *
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is an integer B.
 *
 *
 * Output Format
 * Return the count of good subarrays in A.
 *
 *
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * B = 4
 * Input 2:
 *
 * A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
 * B = 65
 *
 *
 * Example Output
 * Output 1:
 * 6
 * Output 2:
 *
 * 36
 *
 *
 * Example Explanation
 * Explanation 1:
 * Even length good subarrays = {1, 2}
 * Odd length good subarrays = {1, 2, 3}, {1, 2, 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5}
 * Explanation 1:
 * There are 36 good subarrays
 */

public class GoodSubarraysEasy {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{15,8,16}, 242));
    }
    public static int solve(int[] A, int B) {
        int N = A.length;
        int[] prefixevenArray = new int[A.length];
        
        prefixevenArray[0] = A[0];
        for(int i = 1; i < N; i ++) {
            prefixevenArray[i] = prefixevenArray [i - 1] + A[i];
        }
        int ans = 0;

        for(int i = 0; i < N; i ++) {
            for(int j = i; j < N; j++) {
                if(j == 0) {
                    if( prefixevenArray[i + j] > B)
                        ans++;
                } else {
                    int i1 = prefixevenArray[j] - prefixevenArray[i];
                    if((j % 2 == 0 && i1 < B) || ((j & 1) == 1 && i1 > B)) {
                        ans++;
                    }
                }
            }
            
        }
        return ans;
    }

}
