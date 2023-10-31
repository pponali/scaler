package com.practice.oct1;

import com.practice.sort.InsersionSort;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

public class NextPermutation_copy {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextPermutation(new int[]{237, 542})));
    }

    public static int[] nextPermutation(int[] A) {
        if(A.length == 1){
            return A;
        }
        int temp, min = Integer.MAX_VALUE;
        boolean swap = false;
        for(int i = A.length - 2 ; i > 0 ; i--) {
            if (A[i] < A[i + 1]) {
                int j = i + 2, minIndex = -1;
                while (j < A.length) {
                    if (A[j] < min && A[j] > A[i]) {
                        min = A[j];
                        minIndex = j;
                    }
                    j++;
                }
                if (minIndex != -1) {
                    temp = A[i];
                    A[i] = A[minIndex];
                    A[minIndex] = temp;
                } else {
                    temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                }
                swap = true;
                reverse(A, i + 1, A.length - 1);
                break;
            }

        }
        if(!swap){
            InsersionSort.insertionSort(A);
        }


        return A;
    }

    public static int[] reverse(int[] A, int a, int b) {
        int i = a, j = b, temp;
        for(; i < j; i++, j--){
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }

    /*
    create a function to find the next permutation of the array
    find the first element which is less than the next element
    find the element which is greater than the first element and is the smallest element after the first element
    swap the elements
    reverse the elements after the first element
    return the array
    if there is no such permutation then return the array in reverse order
    if there is no such permutation then return the array in ascending order
    create a function to do binary search
    */
    public static int[] nextPermutationBinarySearch(int[] A) {
        int i = A.length - 2;
        while (i >= 0 && A[i] >= A[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = A.length - 1;
            while (A[j] <= A[i]) {
                j--;
            }
            //noinspection DataFlowIssue
            swap(Collections.singletonList(A), i, j);
        }
        reverse(A, i + 1, A.length - 1);
        return A;
    }



}
