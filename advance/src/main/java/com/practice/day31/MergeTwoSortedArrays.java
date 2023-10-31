package com.practice.day31;

import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 27/10/23
 */
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 2, 3, 4, 5, 100}, new int[]{10, 11, 23, 45, 56, 78})));
    }

    private static int[] mergeArrays(final int[] A, final int[] B) {
        int[] C = new int[A.length + B.length];
        int pointer1 =0, pointer2 = 0, pointer3 = 0;
        while(pointer1 < A.length && pointer2 < B.length){
            if(A[pointer1] > B[pointer2]){
                C[pointer3] = B[pointer2];
                pointer2++; pointer3++;
            } else {
                C[pointer3] = A[pointer1];
                pointer1++; pointer3++;
            }
        }
        while(pointer1 < pointer2){
            C[pointer3] = A[pointer1];
            pointer1++; pointer3++;
        }
        while(pointer1 > pointer2){
            C[pointer3] = B[pointer2];
            pointer2++; pointer3++;
        }

        return C;
    }
}
