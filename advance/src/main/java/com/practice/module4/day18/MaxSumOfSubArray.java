package com.practice.module4.day18;

/**
 * @author prakashponali
 * @Date 04/10/23
 */
public class MaxSumOfSubArray {

    public static void main(String[] args) {
        int[] A = new int[]{2,1,-3,4,-1,2,1,-5,4};
        int currentSum = A[0];
        int maxSum = A[0];
        for(int i = 1; i < A.length; i++){
            if(currentSum >= 0) {
                currentSum += A[i];
            } else {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println(maxSum);
    }
}
