package com.practice.module5.day38;

import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 10/11/23
 */
public class Closest_pair_from_sorted_arrays {
    public static void main(String[] args) {
        Closest_pair_from_sorted_arrays closestPairFromSortedArrays = new Closest_pair_from_sorted_arrays();
        System.out.println(Arrays.toString(closestPairFromSortedArrays.solve(new int[]{5, 10, 20}, new int[]{1, 2, 30}, 13)));
    }

    public int[] solve(int[] A, int[] B, int C) {
        int[] ans = new int[2];
        int i = 0, j = B.length - 1;
        while(i < A.length && j >= 0){
            int sum = A[i] + B[j];
            if(sum > C){
                j--;
            } else if(sum < C) {
                i++;
            } else {
                ans[0] = A[i];
                ans[1] = B[j];
              break;
            }
        }

        return ans;
    }
}
