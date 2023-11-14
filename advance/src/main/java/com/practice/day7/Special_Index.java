package com.practice.day7;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description
 *
 *
 * Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 * -105 <= A[i] <= 105
 * Sum of all elements of A <= 109
 *
 *
 * Input Format
 * First argument contains an array A of integers of size N
 *
 *
 * Output Format
 * Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 *
 *
 *
 * Example Input
 * Input 1:
 * A = [2, 1, 6, 4]
 * Input 2:
 *
 * A = [1, 1, 1]
 *
 *
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 *
 * 3
 *
 *
 * Example Explanation
 * Explanation 1:
 * Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1].
 * Therefore, the required output is 1.
 * Explanation 2:
 *
 * Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
 * Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
 * Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
 * Therefore, the required output is 3.
 */
public class Special_Index {

    public static void main(String[] args) {
        Special_Index specialIndex = new Special_Index();
        System.out.println(specialIndex.specialIndex(new int[]{1,1,1}));
    }

    public int specialIndex(int[] A){int[] prefixeven = new int[A.length];
        prefixeven[0] = A[0];
        for(int i = 1; i < A.length; i++) {
            if(i % 2 == 0) {
                prefixeven[i] = prefixeven[i - 1] + A[i];
            } else {
                prefixeven[i] = prefixeven[i - 1];
            }
        }

        int[] prefixodd = new int[A.length];
        prefixodd[0] = 0;
        for(int i = 1; i < A.length; i++) {
            if(i % 2 == 1) {
                prefixodd[i] = prefixodd[i - 1] + A[i];
            } else {
                prefixodd[i] = prefixodd[i - 1];
            }
        }
        int se = 0, so = 0, count = 0, N = A.length;
        for(int i = 0; i < A.length; i++) {
            if(i == 0) {
                se = prefixodd[N-1];
                so = prefixeven[N-1] - prefixeven[i];
            } else {
                se = prefixeven[i - 1] + ( prefixodd[N-1] - prefixodd[i]);
                so = prefixodd[i - 1] + ( prefixeven[N - 1] - prefixeven[i]);
            }
            if(se == so) {
                count++;
            }
        }
        return count;

    }


}
