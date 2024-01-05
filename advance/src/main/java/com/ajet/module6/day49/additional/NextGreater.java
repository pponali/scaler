package com.ajet.module6.day49.additional;

import java.util.Stack;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 11/12/23
 * @Description
 *
 * Given an array A, find the next greater element G[i] for every element A[i] in the array.
 * The next greater element for an element A[i] is the first greater element on the right side of A[i] in the array, A.
 *<p></p>
 * More formally:
 *<p></p>
 * G[i] for an element A[i] = an element A[j] such that
 *     j is minimum possible AND
 *     j > i AND
 *     A[j] > A[i]
 * Elements for which no greater element exists, consider the next greater element as -1.
 *<p></p>
 *
 *
 * Problem Constraints
 *<p></p>
 * 1 <= |A| <= 105
 *<p></p>
 * 1 <= A[i] <= 107
 *<p></p>
 *
 *
 * Input Format
 *<p></p>
 * The first and the only argument of input contains the integer array, A.
 *<p></p>
 *
 *
 * Output Format
 *<p></p>
 * Return an integer array representing the next greater element for each index in A.
 *<p></p>
 *
 *
 * Example Input
 *<p></p>
 * Input 1:
 *<p></p>
 *  A = [4, 5, 2, 10]
 * Input 2:
 *<p></p>
 *  A = [3, 2, 1]
 *<p></p>
 *
 * Example Output
 *<p></p>
 * Output 1:
 *<p></p>
 *  [5, 10, 10, -1]
 * Output 2:
 *<p></p>
 *  [-1, -1, -1]
 *<p></p>
 *
 * Example Explanation
 *<p></p>
 * Explanation 1:
 *<p></p>
 * For 4, the next greater element towards its right is 5.
 * For 5 and 2, the next greater element towards their right is 10.
 * For 10, there is no next greater element towards its right.
 * Explanation 2:
 *
 * As the array is in descending order, there is no next greater element for all the elements.
 */
public class NextGreater {
    public int[] nextGreater(int[] A) {
    int[] result = new int[A.length];
    Stack<Integer> stack = new Stack<>();

        for(int i = A.length - 1; i >=0; i-- ){
        while(!stack.isEmpty() && stack.peek() <= A[i]){
            stack.pop();
        }
        result[i] = stack.isEmpty() ? -1 : stack.peek();
        stack.push(A[i]);
    }
        return result;
}
}
