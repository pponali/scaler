package com.practice.module4.day19;

import java.util.Arrays;

public class RowToColomn {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rowToColomn(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 0}, {9, 2, 0, 4}})));

    }

    public static int[][] rowToColomn(int[][]  A) {

        for(int i =0; i < A.length; i++) {
            boolean flag = false;
            for(int j = 0; j< A[0].length; j++) {
                if(A[i][j] ==0) {
                    flag = true;
                }
            }
            if(flag) {
                for(int j = 0; j< A[0].length; j++) {
                    if(A[i][j] != 0) {
                        A[i][j] = -1;
                    }
                }
            }
        }

        for(int i =0; i < A[0].length; i++) {
            boolean flag = false;
            for(int j = 0; j< A.length; j++) {
                if(A[j][i] ==0) {
                    flag = true;
                }
            }
            if(flag) {
                for(int j = 0; j< A.length; j++) {
                    if(A[j][i] != 0) {
                        A[j][i] = -1;
                    }
                }
            }
        }
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[0].length; j++) {
                if(A[i][j] == -1) {
                    A[i][j] = 0;
                }
            }
        }
        return A;


    }
}