package com.practice.module3.day10;

import java.util.Arrays;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 *
 * Given a 2D integer array A, return the transpose of A.
 *
 * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
 *
 *
 * Problem Constraints
 * 1 <= A.size() <= 1000
 *
 * 1 <= A[i].size() <= 1000
 *
 * 1 <= A[i][j] <= 1000
 *
 *
 *
 * Input Format
 * First argument is a 2D matrix of integers.
 *
 *
 *
 * Output Format
 * You have to return the Transpose of this 2D matrix.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 * Input 2:
 *
 * A = [[1, 2],[1, 2],[1, 2]]
 *
 *
 * Example Output
 * Output 1:
 *
 * [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
 * Output 2:
 *
 * [[1, 1, 1], [2, 2, 2]]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 *  we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
 * Explanation 2:
 *
 * After transposing the matrix, A becomes [[1, 1, 1], [2, 2, 2]]
 */
public class Matrix_Transpose {

    public static void main(String[] args) {
        Matrix_Transpose transpose = new Matrix_Transpose();
        int[][] A = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(transpose.transpose(A)));
    }

    public int[][] transpose(int[][] A){
        for(int i = 1; i < A.length; i++){
            for(int j = 0; j < i; j++){
                swap(A, i, j);
            }
        }
        return A;
    }

    private void swap(int[][] A, int i, int j) {
        int temp = A[i][j];
        A[i][j] = A[j][i];
        A[j][i] = temp;
    }

}
