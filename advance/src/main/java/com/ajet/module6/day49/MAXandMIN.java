package com.ajet.module6.day49;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Author Prakash Ponali (@pponali)
 * @Date 11/12/23
 * @Description
 *
 * Given an array of integers A.
 *<p></p>
 * The value of an array is computed as the difference between the maximum element in the array and the minimum element in the array A.
 *<p></p>
 * Calculate and return the sum of values of all possible subarrays of A modulo 109+7.
 *<p></p>
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 *<p></p>
 * 1 <= A[i] <= 1000000
 *<p></p>
 *
 *
 * Input Format
 * The first and only argument given is the integer array A.
 *<p></p>
 *
 *
 * Output Format
 * Return the sum of values of all possible subarrays of A modulo 109+7.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *  A = [1]
 * Input 2:
 *<p></p>
 *  A = [4, 7, 3, 8]
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  0
 * Output 2:
 *<p></p>
 *  26
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 * Only 1 subarray exists. Its value is 0.
 * Explanation 2:
 *<p></p>
 * value ( [4] ) = 4 - 4 = 0
 * value ( [7] ) = 7 - 7 = 0
 * value ( [3] ) = 3 - 3 = 0
 * value ( [8] ) = 8 - 8 = 0
 * value ( [4, 7] ) = 7 - 4 = 3
 * value ( [7, 3] ) = 7 - 3 = 4
 * value ( [3, 8] ) = 8 - 3 = 5
 * value ( [4, 7, 3] ) = 7 - 3 = 4
 * value ( [7, 3, 8] ) = 8 - 3 = 5
 * value ( [4, 7, 3, 8] ) = 8 - 3 = 5
 * sum of values % 10^9+7 = 26
 *
 */

@Slf4j
public class MAXandMIN {
    int MOD = 1000000007;

    public long minMax(int[] A){
        int n = A.length;
        long result = 0;
        int[] leftGreater = new int[n];
        int[] rightGreater = new int[n];
        int[] leftSmaller = new int[n];
        int[] rightSmaller = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Calculate nearest greater to left
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                stack.pop();
            }
            leftGreater[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        log.info("leftGreater: {}", Arrays.toString(leftGreater));

        stack.clear();

        // Calculate nearest greater to right
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                stack.pop();
            }
            rightGreater[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        log.info("rightGreater: {}", Arrays.toString(rightGreater));

        stack.clear();

        // Calculate nearest smaller to left
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            leftSmaller[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        log.info("leftSmaller: {}", Arrays.toString(leftSmaller));

        stack.clear();

        // Calculate nearest smaller to right
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] > A[i]) {
                stack.pop();
            }
            rightSmaller[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        log.info("rightSmaller: {}", Arrays.toString(rightSmaller));

        // Calculate the total sum
        for (int i = 0; i < n; i++) {
            long maxContribution = (long) (i - leftGreater[i]) * (rightGreater[i] - i) * A[i] % MOD;
            long minContribution = (long) (i - leftSmaller[i]) * (rightSmaller[i] - i) * A[i] % MOD;
            result = (result + maxContribution - minContribution + MOD) % MOD;
            log.info("maxContribution: {}, minContribution: {}, result: {}", maxContribution, minContribution, result);
        }

        return result;

    }

    public int solve(int[] A) {
        Stack<Integer> stack = new Stack<>();

        int[] leftMax = new int[A.length];
        int[] rightMin = new int[A.length];
        int[] leftMin = new int[A.length];
        int[] rightMax = new int[A.length];

        for(int i = 0; i < A.length; i++){
            while(!stack.isEmpty() && A[stack.peek()] >= A[i]){
                stack.pop();
            }
            leftMin[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        log.info("leftMin :: " + Arrays.toString(leftMin));

        stack.clear();

        for(int i = 0; i < A.length; i++){
            while(!stack.isEmpty() && A[stack.peek()] <= A[i]){
                stack.pop();
            }
            leftMax[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        log.info("leftMax :: " + Arrays.toString(leftMax));

        stack.clear();

        for(int i = A.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && A[stack.peek()] >= A[i]){
                stack.pop();
            }
            rightMin[i] = stack.isEmpty() ? A.length : stack.peek();
            stack.push(i);
        }
        log.info("rightMin :: " + Arrays.toString(rightMin));

        stack.clear();

        for(int i = A.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && A[stack.peek()] <= A[i]){
                stack.pop();
            }
            rightMax[i] = stack.isEmpty() ? A.length : stack.peek();
            stack.push(i);
        }

        log.info("rightMax :: " + Arrays.toString(rightMax));

        int mod = 1000000007;
        long sum = 0;

        // Calculate the total sum
        for (int i = 0; i < A.length; i++) {
            long minContribution = (long) (i - leftMin[i]) * (rightMin[i] - i) * A[i] % MOD;
            long maxContribution = (long) (i - leftMax[i]) * (rightMax[i] - i) * A[i] % MOD;
            sum = (sum + maxContribution - minContribution + MOD) % MOD;
            log.info("maxContribution: {}, minContribution: {}, sum: {}", maxContribution, minContribution,sum);
        }

        return (int)sum;

    }


}
