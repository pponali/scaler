package com.practice.module4.day19;

import java.util.Arrays;

public class SpiralOrder {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(5)));
    }
    public static int[][] generateMatrix(int A) {
        int[][] B = new int[A][A];

        int counter = 1,r = 0, c = 0;
        while(A > 1) {
            int i = 0;
            for (; i < A - 1; i++) {
                B[r][c] = counter;
                counter++;
                c++;
            }
            i = 0;
            for (; i < A - 1; i++) {
                B[r][c] = counter;
                counter++;
                r++;
            }
            i = 0;
            for (; i < A - 1; i++) {
                B[r][c] = counter;
                counter++;
                c--;
            }
            i = 0;
            for (; i < A - 1; i++) {
                B[r][c] = counter;
                counter++;
                r--;
            }
            A = A - 2;
            r++;
            c++;
        }
        if(A == 1) {
            B[r][c] = counter;
        }

        return B;

    }
}
