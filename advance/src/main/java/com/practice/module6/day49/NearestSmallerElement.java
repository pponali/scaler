package com.practice.module6.day49;

import java.util.Stack;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 11/12/23
 * @Description
 *
 *
 * Given an array A, find the nearest smaller element G[i] for every element A[i] in the array such that the element has an index smaller than i.
 *<p></p>
 * More formally,
 *<p></p>
 * G[i] for an element A[i] = an element A[j] such that
 *<p></p>
 * j is maximum possible AND
 *<p></p>
 * j < i AND
 *<p></p>
 * A[j] < A[i]
 *<p></p>
 * Elements for which no smaller element exist, consider the next smaller element as -1.
 *<p></p>
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 *<p></p>
 * -109 <= A[i] <= 109
 *<p></p>
 *
 *
 * Input Format
 * The only argument given is integer array A.
 *<p></p>
 *
 *
 * Output Format
 * Return the integar array G such that G[i] contains the nearest smaller number than A[i]. If no such element occurs G[i] should be -1.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *  A = [4, 5, 2, 10, 8]
 * Input 2:
 *<p></p>
 *  A = [3, 2, 1]
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  [-1, 4, -1, 2, 2]
 * Output 2:
 *<p></p>
 *  [-1, -1, -1]
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 * index 1: No element less than 4 in left of 4, G[1] = -1
 * index 2: A[1] is only element less than A[2], G[2] = A[1]
 * index 3: No element less than 2 in left of 2, G[3] = -1
 * index 4: A[3] is nearest element which is less than A[4], G[4] = A[3]
 * index 4: A[3] is nearest element which is less than A[5], G[5] = A[3]
 * Explanation 2:
 *<p></p>
 * index 1: No element less than 3 in left of 3, G[1] = -1
 * index 2: No element less than 2 in left of 2, G[2] = -1
 * index 3: No element less than 1 in left of 1, G[3] = -1
 */
public class NearestSmallerElement {

    public int[] nearestSmallerElement(int[] A){
        int[] result = new int[A.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= A[i]){
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(A[i]);
        }
        return result;
    }
}
