package com.practice.day10;

import java.util.Arrays;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 *
 * You are given a n x n 2D matrix A representing an image.
 *
 * Rotate the image by 90 degrees (clockwise).
 *
 * You need to do this in place.
 *
 * Note: If you end up using an additional array, you will only receive partial score.
 *
 *
 *
 * Problem Constraints
 * 1 <= n <= 1000
 *
 *
 *
 * Input Format
 * First argument is a 2D matrix A of integers
 *
 *
 *
 * Output Format
 * Return the 2D rotated matrix.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  [
 *     [1, 2],
 *     [3, 4]
 *  ]
 * Input 2:
 *
 *  [
 *     [1, 2, 3],
 *     [4, 5, 6],
 *     [7, 8, 9]
 *  ]
 *
 *
 * Example Output
 * Output 1:
 *
 *  [
 *     [3, 1],
 *     [4, 2]
 *  ]
 * Output 2:
 *
 *  [
 *     [7, 4, 1],
 *     [8, 5, 2],
 *     [9, 6, 3]
 *  ]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  After rotating the matrix by 90 degree:
 *  1 goes to 2, 2 goes to 4
 *  4 goes to 3, 3 goes to 1
 * Explanation 2:
 *
 *  After rotating the matrix by 90 degree:
 *  1 goes to 3, 3 goes to 9
 *  2 goes to 6, 6 goes to 8
 *  9 goes to 7, 7 goes to 1
 *  8 goes to 4, 4 goes to 2
 */
public class Rotate_Matrix {

    public static void main(String[] args) {
        Rotate_Matrix rotate90 = new Rotate_Matrix();
        int[][] A = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(rotate90.transpose(A)));
        System.out.println(Arrays.deepToString(rotate90.reverse(A)));
    }

    public int[][] transpose(int[][] A) {
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                swap(A, i, j);
            }
        }
        return A;
    }

    public int[][] reverse(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int j = 0, k = A.length - 1;
            swapRow(A, i);
        }
        return A;
    }

    private void swap(int[][] A, int i, int j) {
        int temp = A[i][j];
        A[i][j] = A[j][i];
        A[j][i] = temp;
    }

    private void swapRow(int[][] A, int i) {
        int j = 0, k = A[0].length - 1;
        while (j < k) {
            int temp = A[i][j];
            A[i][j] = A[i][k];
            A[i][k] = temp;
            j++;
            k--;
        }

    }
}
