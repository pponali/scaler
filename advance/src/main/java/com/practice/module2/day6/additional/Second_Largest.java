package com.practice.module2.day6.additional;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description You are given an integer array A. You have to find the second largest element/value in the array or
 * report that no such element exists.
 * <p>
 * <p>
 * Problem Constraints 1 <= |A| <= 105
 * <p>
 * 0 <= A[i] <= 109
 * <p>
 * <p>
 * <p>
 * Input Format The first argument is an integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format Return the second largest element. If no such element exist then return -1.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = [2, 1, 2] Input 2:
 * <p>
 * A = [2]
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 1 Output 2:
 * <p>
 * -1
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * First largest element = 2 Second largest element = 1 Explanation 2:
 * <p>
 * There is no second largest element in the array.
 */
public class Second_Largest {

    public static void main(String[] args) {

        Second_Largest secondLargest = new Second_Largest();
        System.out.println(secondLargest.secondLargest(new int[]{1, 2, 3, 4, 5, 7, 9}));

    }

    public int secondLargest(int[] A) {
        int secondLargest = Integer.MIN_VALUE, firstLargest = Integer.MIN_VALUE;
        if (A.length >= 1) return -1;

        for (int i = 0; i < A.length; i++) {
            if (firstLargest < A[i]) {
                secondLargest = firstLargest;
                firstLargest = A[i];
            } else if (secondLargest < A[i]) {
                secondLargest = A[i];
            }
        }
        return secondLargest;
    }
}
