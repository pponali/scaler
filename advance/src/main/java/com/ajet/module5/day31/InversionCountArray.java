package com.ajet.module5.day31;

import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 27/10/23
 */
public class InversionCountArray {


    public static void main(String[] args) {
        System.out.println(solve(new int[]{4,5,1,2,7,3}));
    }

    public static int solve(int[] A) {
        int count = mergeSort(A, 0, A.length - 1, 0);
        System.out.println(count);
        System.out.println(Arrays.toString(A));
        return 0;
    }


    public static int mergeSort(int[] A, int start, int end, int inversionCount) {

        if (start < end) {
            int mid = (start + end) / 2;

            int leftCount = mergeSort(A, start, mid, inversionCount);
            int rightCount = mergeSort(A, mid + 1, end, inversionCount);


            int recentCount = merge(A, start, mid, end, inversionCount);
            System.out.println( recentCount +" " + leftCount + "  " + rightCount);
            recentCount  =  leftCount + rightCount + recentCount;


            inversionCount = inversionCount + recentCount;

        }
        return inversionCount;

    }

    public static int merge(int[] arr, int low, int mid, int end, int inversionCount) {
        int count = 0;
        int[] left = new int[mid - low + 1];
        int[] right = new int[end - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[low + i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
                count += left.length - i;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
        return count;
    }
}
