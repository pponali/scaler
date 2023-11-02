package com.practice.day30;

import java.util.Arrays;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(pascalsTriangle(10)));
    }

    private static int[][] pascalsTriangle(int A) {
        int[][] arr = new int[A][A];
        arr[0][0] = 1;
        for(int i = 1; i < A; i++){
            for(int j = 1; j < i; j++){
                arr[i][0] = 1;
                arr[i][i] = 1;
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        return arr;
    }
}
