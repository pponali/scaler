package com.ajet.sep4;

import java.util.Arrays;

public class AllSubArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(allSubArrays(new int[]{36, 63, 63, 26, 87, 28, 77, 93, 7})));
    }
    public static int[][] allSubArrays(int[] A) {

        int[][] newArray = new int[A.length*(A.length+1)/2][];
        int m = 0;
        for(int i = 0; i < A.length; i++) {
            for(int j = i; j < A.length; j++) {
                int[] subArry = new int[j - i + 1];
                for(int k = i; k <= j; k++) {
                    subArry[k - i] = A[k];
                }
                newArray[m] = subArry; m++;
            }
        }
        return newArray;
    }
}
