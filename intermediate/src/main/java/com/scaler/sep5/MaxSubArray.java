package com.scaler.sep5;

public class MaxSubArray {

    public static void main(String[] args) {
        System.out.println(maxSubarray(2,  4, new int[]{8,7}));
    }

    public static int maxSubarray(int A, int B, int[] C) {
        int total = 0;
        for(int i = 0; i < C.length; i++) {
            int sum = 0;
            for(int j = i; j < C.length; j++) {
                sum = sum + C[j];
                if(sum <= B) {
                    total = Math.max(total, sum);
                }
            }
        }
        return total;
    }
}
