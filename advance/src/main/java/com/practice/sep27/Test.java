package com.practice.sep27;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] A = new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotateBruteforce(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        rotate(A, 0, A.length - 1);
        System.out.println(Arrays.toString(A));
        rotate(A, 0, 2);
        rotate(A, 3, 6);
        System.out.println(Arrays.toString(A));


    }



    private static int[] rotateBruteforce(int[] ints, int a) {
        for(int j = 0; j < a; j++) {
            int temp = ints[ints.length - 1];
            for (int i = ints.length - 1; i > 0; i--) {
                ints[i] = ints[i - 1];
            }
            ints[0] = temp;
        }
        return ints;

    }

    public static void rotate(final int[] A, final int a, final int b) {
        int i = a, j = b;
        int temp;

        for(; i < j; i++,j--) {
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }

    }

}
