package com.practice.module4.day22;

/**
 * @author prakashponali
 * @Date 09/10/23
 */
public class MaximumSumPairWithBit {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    public static int solve(int[] A) {
        int sum = 0;
        for(int i = 31; i >=0; i--){
            int count = 0;
            for (int k : A) {
                if ((k & (1 << i)) != 0) {
                    count++;
                }
            }
            if(count >= 2){
                sum = sum | (1 << i);
                for(int j = 0; j < A.length; j++){
                    if((A[j] & (1 << i)) == 0) {
                        A[j] = 0;
                    }
                }
            }
        }


        return sum;

    }
}
