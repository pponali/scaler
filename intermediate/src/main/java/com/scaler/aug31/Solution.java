package com.scaler.aug31;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[][] B = new int[3][2];
        B[0][0] = 0;
        B[0][1] = 1;
        B[1][0] = 2;
        B[1][1] = 2;
        B[2][0] = 2;
        B[2][1] = 2;
        System.out.println(Arrays.toString(rangeSum(new int[]{1, 2, 3}, B)));
    }
    public static long[] rangeSum(int[] A, int[][] B) {
        int[] prefixArray = new int[A.length];
        prefixArray[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + A[i];

        }
        long[] M = new long[B.length];
        for(int i = 0 ; i < B.length; i ++) {
            int start = B[i][0];
            int end = B[i][1];
            if(start == 0) {
                M[i] = prefixArray[i];
            } else {
                M[i] = prefixArray[end] - prefixArray[start - 1];
            }
        }
        return M;
    }
}

