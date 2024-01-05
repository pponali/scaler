package com.ajet.module6.day49;

import java.util.Stack;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 11/12/23
 * @Description
 *
 *
 * Given an array of integers A.
 *<p></p>
 * A represents a histogram i.e A[i] denotes the height of the ith histogram's bar. Width of each bar is 1.
 *<p></p>
 * Find the area of the largest rectangle formed by the histogram.
 *<p></p>
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 *<p></p>
 * 1 <= A[i] <= 10000
 *<p></p>
 *
 *
 * Input Format
 * The only argument given is the integer array A.
 *<p></p>
 *
 *
 * Output Format
 * Return the area of the largest rectangle in the histogram.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *  A = [2, 1, 5, 6, 2, 3]
 * Input 2:
 *<p></p>
 *  A = [2]
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  10
 * Output 2:
 *<p></p>
 *  2
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 * The largest rectangle has area = 10 unit. Formed by A[3] to A[4].
 * Explanation 2:
 *
 * Largest rectangle has area 2.
 */
public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] A) {
        int[] left = new int[A.length];
        int[] right = new int[A.length];
        Stack<Integer> stack = new Stack<>();
        left[0] = -1;
        right[A.length - 1] = A.length;

        for(int i = 0; i < A.length; i++){
            while(!stack.isEmpty() && A[stack.peek()] >= A[i]){
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        for(int i = A.length - 2; i >= 0; i--){
            int j = i + 1;
            while(j < A.length && A[j] >= A[i]){
                j = right[j];
            }
            right[i] = j;
        }

        int maxArea = 0;
        for(int i = 0; i < A.length; i++){
            maxArea = Math.max(maxArea, (right[i] - left[i] - 1) * A[i]);
        }

        return maxArea;

    }


}
