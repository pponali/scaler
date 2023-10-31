package com.practice.sort;

import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 03-10-2023
 */
public class MergeSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(margeSort(new int[]{4, 5, 23, 5, 6, 2, 5, 7, 8, 212, 6, 3})));
    }


    /**
     *
     *  Marge Sort
     * <p>
     *   - Divide the array into two halves
     *   - Sort the two halves
     *   - Merge the two sorted halves
     *   - Repeat the above steps until the array is sorted
     * <p>
     *   Time Complexity: O(nlogn)
     *   Space Complexity: O(n)
     * <p>
     *   Best Case: O(nlogn)
     *   Worst Case: O(nlogn)
     *   Average Case: O(nlogn)
     * <p>
     *   Reference:
     *   <a href="https://www.youtube.com/watch?v=LPFhl65R7ww&list=PL2q4fbVm1Ik6DCzm9V5LkA6xIe-ZsV7w&index=2">...</a>
     * <p>
     *   Algorithm:
     *   - Divide the array into two halves
     *   - Sort the two halves
     *   - Merge the two sorted halves
     *   - Repeat the above steps until the array is sorted
     *   - Return the sorted array
     *   - Time Complexity: O(nlogn)
     *   - Space Complexity: O(n)
     *   - Best Case: O(nlogn)
     *   - Worst Case: O(nlogn)
     *   - Average Case: O(nlogn)
     *   - Reference:
     *   - <a href="https://www.youtube.com/watch?v=LPFhl65R7ww&list=PL2q4fbVm1Ik6DCzm9V5LkA6xIe-ZsV7w&index=2">...</
     * <p>
     *   Advantages:
     * <p>
     *   - In-place
     *   - Stable
     *   - Adaptive
     *   - Memory efficient
     *   - Fast
     * <p>
     *   Disadvantage:
     * <p>
     *   - Unnecessary swaps: No
     *   - Not suitable for large data sets: No
     *
     * <p>
     *   - Base Case:
     *   - If the array is of size 1 or 0, then return the array
     * <p>
     *   - Recursive Case:
     *   - Divide the array into two halves
     *   - Sort the two halves
     *   - Merge the two sorted halves
     *   - Repeat the above steps until the array is sorted
     * <p>
     * Example:
     *  [4, 5, 23, 5, 6, 2, 5, 7, 8, 212, 6, 3]
     *
     *
     *
     *
     *
     *
     */
    private static int[] margeSort(int[] ints) {
        int n = ints.length;
        if(n < 2) return ints;
        int mid = n / 2;
        int[] left = Arrays.copyOfRange(ints, 0, mid);
        int[] right = Arrays.copyOfRange(ints, mid, n);
        return merge(margeSort(left), margeSort(right));



    }

    private static int[] merge(int[] ints, int[] ints1) {
        int n = ints.length;
        int m = ints1.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (ints[i] < ints1[j]) {
                result[k++] = ints[i++];
            } else {
                result[k++] = ints1[j++];
            }
        }
        while (i < n) {
            result[k++] = ints[i++];
        }
        while (j < m) {
            result[k++] = ints1[j++];
        }
        return result;
    }


}
