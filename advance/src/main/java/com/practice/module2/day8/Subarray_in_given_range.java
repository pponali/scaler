package com.practice.module2.day8;

import java.util.Arrays;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description
 */
public class Subarray_in_given_range {
    public static void main(String[] args) {
        Subarray_in_given_range subarrayInGivenRange = new Subarray_in_given_range();
        System.out.println(Arrays.toString(subarrayInGivenRange.subarrayInGivenRange(new int[]{1,2,3,4,5,6,7,8,9}, 3, 6)));

    }

    public int[] subarrayInGivenRange(int[] A, int B, int C){
        int[] subArray = new int[C - B + 1];
        for (int i = B; i <= C; i ++){
            subArray[i - (B)] = A[i];
        }
        return subArray;
    }
}
