package com.practice.module2.day8.additional;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description
 */
public class Best_Time_to_Buy_and_Sell_Stocks_I {
    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stocks_I bestTimeToBuyAndSellStocksI = new Best_Time_to_Buy_and_Sell_Stocks_I();
        System.out.println(bestTimeToBuyAndSellStocksI.bestTimeToBuyAndSellStocksI(new int[]{111,20,13,12,11,10,9}));


    }

    public int bestTimeToBuyAndSellStocksI(int[] A){
        if(A.length == 0) {
            return 0;
        }
        int profit = 0, maxprofit = 0, max = A[A.length - 1];
        for(int i = A.length - 2; i >= 0; i--) {
            if(A[i] > max) {
                max = A[i];
            }
            profit = max - A[i];
            if(profit > maxprofit) {
                maxprofit = profit;
            }
        }
        return maxprofit;

    }
}
