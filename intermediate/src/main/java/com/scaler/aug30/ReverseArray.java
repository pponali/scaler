package com.scaler.aug30;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] A = {3,5,3,4,7,8,2,9};
        System.out.println(Arrays.toString(reverseArray(A, 0, 6)));
    }

    public static int[] reverseArray(int[] A, int i, int j) {

        int temp;
        while(i <= j){
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;

    }
}
