package com.ajet.sort;

import java.util.Arrays;

public class InsersionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{4, 5, 23, 5, 6, 2, 5, 7, 8, 212, 6, 3})));
    }


    /**
     * Insertion Sort
     *
     * Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands.
     *
     * The array is virtually split into a sorted and an unsorted part.
     * Values from the unsorted part are picked and placed at the correct position in the sorted part.
     *
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     *
     * Best Case: O(n)
     * Worst Case: O(n^2)
     *
     * Advantages:
     *  - Easy to implement
     *
     * Disadvantages:
     *  - Inefficient for large data sets
     *
     * Reference:
     *  - https://www.geeksforgeeks.org/insertion-sort/
     *  - https://www.youtube.com/watch?v=lQX2JWbhp7E
     *  - https://www.youtube.com/watch?v=LF-ZcgKbYK8
     *  - https://www.youtube.com/watch?v=2-1-4_O0Rg
     *  - https://www.youtube.com/watch?v=jWZs0FpXk2Q
     *  - https://www.youtube.com/watch?v=YL0Hlw3-Ud4
     *  - https://www.youtube.com/watch?v=5Ce5pKkUZ-A
     *  - https://www.youtube.com/watch?v=LY2-YX7Jcx8
     *  - https://www.youtube.com/watch?v=2-1-4_O0Rg
     *
     * Algorithm:
     *  - Start by picking the second element in the array.
     *  - Now compare the second element with the one before it and swap if necessary.
     *  - Continue to the next element and if it is in the incorrect order, iterate through the sorted portion (i.e. the left side) to place the element in the correct place.
     *  - Repeat until the array is sorted.
     *
     *  Example:
     *  - Input: 1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92
     *  - Output: 1, 1, 2, 2, 4, 4, 8, 32, 32, 43, 43, 55, 63, 92, 123, 123, 234, 345, 5643
     *
     *  - Input: 1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92
     *
     * @param A
     * @return
     */
    public static int[] insertionSort(int[] A){

        insertion(A);

        return A;
    }

    public static void insertion(final int[] A) {
        System.out.println(Arrays.toString(A));
        for(int i = 1; i < A.length; i++){
            System.out.println(Arrays.toString(A));
            int j = i - 1, key = A[i];
            while(j >= 0 && A[j] > key){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }
}
