package com.ajet.module2.day9;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 */
public class Subarray_with_given_sum_and_length {
    public static void main(String[] args) {
        Subarray_with_given_sum_and_length subarrayWithGivenSumAndLength = new Subarray_with_given_sum_and_length();
        System.out.println(subarrayWithGivenSumAndLength.subarrayWithGivenSumAndLength(new int[]{4, 3, 2, 6, 1}, 3, 11));
        System.out.println(subarrayWithGivenSumAndLength.subarrayWithGivenSumAndLength(new int[]{4, 2, 2, 5, 1}, 4, 6));
    }

    public int subarrayWithGivenSumAndLength(int[] A, int B, int C){
        int sum = 0;
        for(int i = 0; i < B; i++){
            sum += A[i];
        }
        int i = B;
        while(i < A.length){
            sum = sum + A[i] - A[i - B];
            if(sum == C){
                return 1;
            }
            i++;
        }
        return 0;

    }
}
