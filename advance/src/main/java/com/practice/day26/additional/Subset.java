package com.practice.day26.additional;

import java.util.Arrays;

public class Subset {

    public static void main(String[] args) {
        subset(new int[]{1, 3, 4, 5, 6}, 2, 2);

    }

    public static void subset(int[] A, int left, int right) {
        if (left == right) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(A, left, right)));
            return;
        }
        if (left - 1 >= 0) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(A, left - 1, right)));
            subset(A, left + 1, right);
        }
        if (right < A.length) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(A, left, right + 1)));
            subset(A, left, right - 1);
        }
    }
}
