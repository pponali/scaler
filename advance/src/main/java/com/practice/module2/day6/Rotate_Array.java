package com.practice.module2.day6;

import java.util.Arrays;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description Given an integer array A of size N and an integer B, you have to return the same array after rotating it
 * B times towards the right.
 * <p>
 * <p>
 * Problem Constraints 1 <= N <= 105 1 <= A[i] <=109 1 <= B <= 109
 * <p>
 * <p>
 * Input Format The first argument given is the integer array A. The second argument given is the integer B.
 * <p>
 * <p>
 * Output Format Return the array A after rotating it B times to the right
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = [1, 2, 3, 4] B = 2 Input 2:
 * <p>
 * A = [2, 5, 6] B = 1
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * [3, 4, 1, 2] Output 2:
 * <p>
 * [6, 2, 5]
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2] Explanation 2:
 * <p>
 * Rotate towards the right 1 time - [2, 5, 6] => [6, 2, 5]
 */
public class Rotate_Array {

    public static void main(String[] args) {
        Rotate_Array rotateArray = new Rotate_Array();
        int[] array = new int[]{1,2,3,4,5,6,7,8};
        rotateArray.rotateArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public void rotateArray(int[] A, int B) {
        if (B > A.length) {
            B = B % A.length;
        }
        reverse(A, 0, A.length - 1);
        reverse(A, 0, B);
        reverse(A, B + 1, A.length - 1);

    }

    private void reverse(int[] A, int B, int C) {
        int i = B, j = C, temp = 0;
        for (; i < j; j--, i++) {
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
}
