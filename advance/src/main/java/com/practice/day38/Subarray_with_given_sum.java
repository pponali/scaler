package com.practice.day38;

/**
 * @author prakashponali
 * @Date 10/11/23
 */


import java.util.Arrays;

public class Subarray_with_given_sum {
    public static void main(String[] args) {
        Subarray_with_given_sum subarrayWithGivenSum = new Subarray_with_given_sum();
        System.out.println(Arrays.toString(subarrayWithGivenSum.solve(new int[]{1, 2, 3, 4, 5}, 5)));
    }

    public int[] solve(int[] A, int B) {
        int i = 0, j = 0, sum = A[0];
        if(A[0] == B){
            return new int[]{0};
        }
        while(j < A.length){
            if(sum == B){
                return Arrays.copyOfRange(A, i, j + 1);
            } else if(sum < B){
                j++;
                if(j < A.length){
                    sum += A[j];
                }
            } else {

                if(i <= j){
                    sum -= A[i];
                }
                i++;
            }
        }
        return new int[]{-1};

    }
}
