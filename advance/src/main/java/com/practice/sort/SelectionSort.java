package com.practice.sort;

import java.util.Arrays;



public class SelectionSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{4, 5, 23, 5, 6, 2, 5, 7, 8, 212, 6, 3})));
    }

    /**
     *
     * Selection sort is a sorting algorithm that selects the smallest element from an unsorted
     * list in each iteration and places that element at the beginning of the unsorted list.
     *
     * Selection sort is not a stable sort.
     *
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     *
     * Best Case: O(n^2)
     * Worst Case: O(n^2)
     *
     * Advance Selection Sort:
     *  - In this algorithm, we do not swap the elements.
     *  Instead we store the index of the smallest
     *
     *  Disadvantages:
     *  - In this algorithm, we do not swap the elements.
     *  Instead we store the index of the smallest
     *
     *  References:
     *  - <a href="https://www.geeksforgeeks.org/selection-sort/">Ref1</a>
     *  - <a href="https://www.youtube.com/watch?v=GgqKbqm0X-w">Ref2</a>
     *  - <a href="https://www.youtube.com/watch?v=QHW9O5GJJ5I">Ref3</a>
     *  - <a href="https://www.youtube.com/watch?v=Y0jhvYpHh_Q">Ref4</a>
     *  - <a href="https://www.youtube.com/watch?v=z6ZZvQh0E-Q">Ref5</a>
     *  - <a href="https://www.youtube.com/watch?v=wKXnVUZ2vQw">Ref6</a>
     *  - <a href="https://www.youtube.com/watch?v=WcFZsuEV5Bw">Ref7</a>
     *  - <a href="https://www.youtube.com/watch?v=6XjqgO1-Pqo">Ref8</a>
     *  - <a href="https://www.youtube.com/watch?v=jWgz9XFZQ_k">Ref9</a>
     *
     *  Algorithm:
     *
     *  1. Iterate over the array
     *
     *  2. Find the smallest element in the array
     *
     *  3. Swap the smallest element with the current element
     *
     *  4. Repeat step 2 and 3 until the array is sorted
     *
     *  5. Return the sorted array
     *
     *
     * @param A
     * @return
     */
    private static int[] selectionSort(int[] A) {

        for(int i = 0; i < A.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < A.length; j++){
                if(A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = temp;
        }
        return A;

    }
}
