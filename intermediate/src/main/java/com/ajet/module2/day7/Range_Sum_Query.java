package com.ajet.module2.day7;

import java.util.Arrays;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description
 */
public class Range_Sum_Query {
    public static void main(String[] args) {
        Range_Sum_Query rangeSumQuery = new Range_Sum_Query();

        System.out.println(Arrays.toString(rangeSumQuery.rangeSumQuery(new int[]{1, 2, 4, 5, 6, 7, 8, 4, 3, 2, 5, 7, 3}, new int[][]{{2, 4}, {1, 5}, {4, 7}, {0, 1}})));

    }

    public int[] rangeSumQuery(int[] A, int[][] B) {
        int[] ans = new int[B.length];
        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        int L, R;
        for (int i = 0; i < B.length; i++) {
            L = B[i][0];
            R = B[i][1];
            ans[i] = prefix[R] - prefix[L];
        }
        return ans;

    }

}
