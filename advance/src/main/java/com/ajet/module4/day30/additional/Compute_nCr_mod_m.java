package com.ajet.module4.day30.day30.additional;

public class Compute_nCr_mod_m {
    public static void main(String[] args) {
        System.out.println(compute_nCr_mod_m(10, 2));
    }

    private static int compute_nCr_mod_m(int n, int r) {
        int[][] ncr = new int[n + 1][r + 1];
        ncr[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.max(i, r); j++) {
                if (j == 0 || j == i) {
                    ncr[i][j] = 1;
                } else {
                    ncr[i][j] = ncr[i - 1][j - 1] + ncr[i - 1][j];
                }
            }
        }

        return ncr[n][r];
    }
}
