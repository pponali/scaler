package com.ajet.module3.day10.additional;

import java.util.Arrays;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A
 * with an integer B.
 * <p>
 * <p>
 * Problem Constraints 1 <= A.size() <= 1000
 * <p>
 * 1 <= A[i].size() <= 1000
 * <p>
 * 1 <= A[i][j] <= 1000
 * <p>
 * 1 <= B <= 1000
 * <p>
 * <p>
 * <p>
 * Input Format First argument is 2D array of integers A representing matrix.
 * <p>
 * Second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format You have to return a 2D array of integers after doing required operations.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = [[1, 2, 3], [4, 5, 6], [7, 8, 9]] B = 2 Input 2: A = [[1]] B = 5
 * <p>
 * <p>
 * Example Output Output 1: [[2, 4, 6], [8, 10, 12], [14, 16, 18]] Output 2: [[5]]
 * <p>
 * <p>
 * Example Explanation Explanation 1: ==> ( [[1, 2, 3],[4, 5, 6],[7, 8, 9]] ) * 2
 * <p>
 * ==> [[2*1, 2*2, 2*3], [2*4, 2*5, 2*6], [2*7, 2*8, 2*9]]
 * <p>
 * ==> [[2,   4,  6], [8,  10, 12], [14, 16, 18]] Explanation 2: ==> ( [[1]] ) * 5
 * <p>
 * ==> [[5*1]]
 * <p>
 * ==> [[5]]
 */
public class Matrix_Scalar_Product {


    public static void main(String[] args) {
        Matrix_Scalar_Product matrixScalarProduct = new Matrix_Scalar_Product();
        int[][] A = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrixScalarProduct.matrixScalarProduct(A, 3);
        System.out.println(Arrays.deepToString(A));

    }

    public void matrixScalarProduct(int[][] A, int B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = A[i][j] * B;
            }
        }

    }
}
