package com.ajet.sep5;

public class MaxProfit {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2}));
    }
    public static int maxProfit(final int[] A) {
        int profit = 0, maxprofit = 0, max = 0;
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > max) {
                max = A[i];
                profit = max - A[i];
            }

            if (profit > maxprofit) {
                maxprofit = profit;
            }
        }
        return maxprofit;
    }
}
