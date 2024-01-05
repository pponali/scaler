package com.ajet.module2.day6;

import java.util.Arrays;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A
 * within the given inclusive range [B, C].
 * <p>
 * <p>
 * Problem Constraints 1 <= N <= 105 1 <= A[i] <= 109 0 <= B <= C <= N - 1
 * <p>
 * <p>
 * Input Format The first argument A is an array of integer. The second and third arguments are integers B and C
 * <p>
 * <p>
 * Output Format Return the array A after reversing in the given range.
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = [1, 2, 3, 4] B = 2 C = 3 Input 2:
 * <p>
 * A = [2, 5, 6] B = 0 C = 2
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * [1, 2, 4, 3] Output 2:
 * <p>
 * [6, 5, 2]
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * We reverse the subarray [3, 4]. Explanation 2:
 * <p>
 * We reverse the entire array [2, 5, 6].
 */
public class Reverse_in_a_range {

    public static void main(String[] args) {
        Reverse_in_a_range reverseInARange = new Reverse_in_a_range();
        int[] array = new int[]{8,5,2,3,5,6,1,7};
        reverseInARange.reverseInARange(array, 3,6);
        System.out.println(Arrays.toString(array));
    }

    public void reverseInARange(int[] A, int B, int C) {
        int i = B;
        int j = C;
        for(; i < j; j--, i++){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
}
