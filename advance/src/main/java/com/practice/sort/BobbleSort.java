package com.practice.sort;

import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 03-10-2023
 */
public class BobbleSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{4, 5, 23, 5, 6, 2, 5, 7, 8, 212, 6, 3})));
    }


    /**
     *
     * bubble sort is a sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
     * <p>
     * Time-complexity: O(n^2)
     * Space complexity:  O(1)
     * <p>
     * Best case: O(n)
     * Worst case: O(n^2)
     * <p>
     * Advantages:
     *  1. Stable
     *  2. In-place
     * <p>
     *  Disadvantages:
     *  3. Unnecessary swaps
     *  4. Not adaptive
     *  5. Not suitable for large data sets
     * <p>
     *  References:
     *  1. <a href="https://www.geeksforgeeks.org/bubble-sort/">Ref1</a>
     *  2. <a href="https://www.youtube.com/watch?v=LtMtG9PFZF0">Ref2</a>
     *  3. <a href="https://www.youtube.com/watch?v=LtMtG9PFZF0">Ref3</a>
     *  4. <a href="https://www.youtube.com/watch?v=LtMtG9PFZF0">Ref4</a>
     * <p>
     *
     *  Algorithm:
     *  1. Iterate over the array from 0 to n-1
     *  2. For each iteration, compare the current element with the next element
     *  3. If the current element is greater than the next element, swap the elements
     *  4. Repeat step 2 until the array is sorted
     * <p>
     *  Example:
     *  1. [4, 5, 23, 5, 6, 2, 5, 7, 8, 212, 6, 3]
     *  2. [4, 5, 5, 6, 2, 5, 7, 8, 212, 6, 3, 23]
     *  3. [4, 5, 5, 6, 2, 3, 7, 8, 212, 6, 23, 5]
     *  4. [4, 5, 5, 6, 2, 3, 7, 8, 212, 6, 23, 5]
     *  5. [4, 5, 5, 6, 2, 3, 7, 8, 212, 6, 23, 5]
     *
     */
    private static int[] bubbleSort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
        return ints;
    }
}
