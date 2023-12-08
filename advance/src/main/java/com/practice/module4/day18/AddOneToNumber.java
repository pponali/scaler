package com.practice.module4.day18;

import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 17/10/23
 */
public class AddOneToNumber {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9,9})));
    }

    public static  int[] plusOne(int[] A) {

        //reverse the array for making life easy
        //at the end we have to rever the array again for
        //getting the answer.
        int i = 0, j = A.length - 1;
        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        A[0] = A[0] + 1;
        int carry = 0;
        for (int k = 0; k < A.length; k++) {
            if (A[k] > 9) {
                carry = A[k] / 10;
                A[k] = A[k] % 10;

                if (k < A.length - 1) {
                    A[k + 1] = A[k + 1] + carry;
                    carry = 0;
                }
            }
        }

        int l = 0, m = A.length - 1;
        while (l < m) {
            int temp = A[l];
            A[l] = A[m];
            A[m] = temp;
            l++;
            m--;
        }

        return A;

    }


}
