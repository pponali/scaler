package com.practice.module3.day11.day11;

import java.util.Arrays;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 *
 * Given an integer array A of size N. You can remove any element from the array in one operation.
 * The cost of this operation is the sum of all elements in the array present before this operation.
 *
 * Find the minimum cost to remove all elements from the array.
 *
 *
 *
 * Problem Constraints
 * 0 <= N <= 1000
 * 1 <= A[i] <= 103
 *
 *
 *
 * Input Format
 * First and only argument is an integer array A.
 *
 *
 *
 * Output Format
 * Return an integer denoting the total cost of removing all elements from the array.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [2, 1]
 * Input 2:
 *
 *  A = [5]
 *
 *
 * Example Output
 * Output 1:
 *
 *  4
 * Output 2:
 *
 *  5
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Given array A = [2, 1]
 *  Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
 *  Remove 1 from the array => []. Cost of this operation is (1) = 1.
 *  So, total cost is = 3 + 1 = 4.
 * Explanation 2:
 *
 *  There is only one element in the array. So, cost of removing is 5.
 */
public class ElementsRemoval {

    public static void main(String[] args) {
        ElementsRemoval elementsRemoval = new ElementsRemoval();
        int[] A  = new int[]{9,2,7,4,5,7,6,1};
        elementsRemoval.insertionSort(A);
        System.out.println(Arrays.toString(A));
        System.out.println(elementsRemoval.elementsRemoval(A));
    }

    public int elementsRemoval(int[] A){
        int cost = 0;
        insertionSort(A);
        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        for(int i = 1; i < A.length; i++){
            prefix[i] = prefix[i - 1] + A[i];
        }
        for(int i = 1; i < A.length; i++){
            cost += prefix[i];
        }
        return cost;
    }

    public void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int key = A[i]; int j = i - 1;
            while(j >= 0 && A[j] > key){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

}
