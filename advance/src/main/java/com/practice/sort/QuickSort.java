package com.practice.sort;

import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 03/10/23
 */
public class QuickSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{4, 5, 23, 5, 6, 2, 5, 7, 8, 212, 6, 3})));
    }

    // Time complexity: O(nlogn)
    // Space complexity: O(n)
    // Stable: No
    // In-place: Yes
    // Unnecessary swaps: Yes
    // Not adaptive: No
    // Not suitable for large data sets: No
    //  Algorithm:
    //  1. Find the pivot element
    //  2. Partition the array around the pivot element
    //  3. Recursively sort the left and right subarrays
    //  4. Return the sorted array
    //  5. Example:
    //  1. [4, 5, 23, 5, 6, 2, 5, 7, 8, 212, 6, 3]
    //  2. [4, 5, 5, 6, 2, 5, 7, 8, 212, 6, 3, 23]
    //  3. [4, 5, 5, 6, 2, 5, 7, 8, 212, 6, 3, 23]
    //  4. [4, 5, 5, 6, 2, 5, 7, 8, 212, 6, 3, 23]
    //  5. [4, 5, 5, 6, 2, 5, 7, 8, 212, 6, 3, 23]
    //  6. [4, 5, 5, 6, 2, 5, 7, 8, 212, 6, 3, 23]

    /**
     * Quick sort
     * <p>
     *   - Divide the array into two halves
     *   - Sort the two halves
     *   - Merge the two sorted halves
     *   - Repeat until the array is sorted
     *   - Time Complexity: O(nlogn)
     *   - Space Complexity: O(n)
     *   - Best Case: O(nlogn)
     *   - Worst Case: O(nlogn)
     *   - Average Case: O(nlogn)
     *   - Reference:
     *   - <a href="https://www.youtube.com/watch?v=LPFhl65R7ww&list=PL2q4fbVm1Ik6DCzm9V5LkA6xIe-ZsV7w&index=2">...</a>
     *
     * <p>
     *   Advantages:
     *   - Fast
     *   - Memory efficient
     *   - In-place
     *   - Stable
     *   - Adaptive
     *
     *
     *
     * <p>
     *    Disadvantage:
     *    - Unnecessary swaps: Yes
     *    - Not suitable for large data sets: No
     *    - Not adaptive: No
     *    - Not suitable for large data sets: No
     *
     * <p>
     *
     *   - References:
     *   - <a href="https://www.youtube.com/watch?v=LPFhl65R7ww&list=PL2q4fbVm1Ik6DCzm9V5LkA6xIe-ZsV7w&index=2">Ref1</a>
     *   - <a href="https://www.youtube.com/watch?v=LPFhl65R7ww&list=PL2q4fbVm1Ik6DCzm9V5LkA6xIe-ZsV7w&index=2">Ref2</a>
     *   - <a href="https://www.youtube.com/watch?v=LPFhl65R7ww&list=PL2q4fbVm1Ik6DCzm9V5LkA6xIe-ZsV7w&index=2">Ref3</a>
     *

     * @param ints - unsorted array
     * @return - sorted array
     */
    public static int[] mergeSort(int[] ints) {
        // Base case
        if (ints.length <= 1) {
            return ints;
        }
        // Recursive case
        int pivot = ints[ints.length - 1];
        int[] left = new int[ints.length - 1];
        int[] right = new int[ints.length - 1];
        int i = 0, j = 0;
        for (int k = 0; k < ints.length - 1; k++) {
            if (ints[k] < pivot) {
                left[i++] = ints[k];
            } else {
                right[j++] = ints[k];
            }
        }
        return merge(mergeSort(left), mergeSort(right));
    }


    /**
     * Merge two sorted arrays
     * <p>
     *     - Time complexity: O(n)
     *     - Space complexity: O(n)
     *     - Best Case: O(n)
     *     - Worst Case: O(n)
     *     - Average Case: O(n)
     *
     *
     * @param ints - sorted array
     * @param ints1 - sorted array
     * @return - merged sorted array
     */
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
