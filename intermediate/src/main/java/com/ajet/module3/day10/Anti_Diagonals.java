package com.ajet.module3.day10;

import java.util.Arrays;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description
 */
public class Anti_Diagonals {
    public static void main(String[] args) {
        Anti_Diagonals antiDiagonals = new Anti_Diagonals();
        System.out.println(Arrays.deepToString(antiDiagonals.antiDiagonals(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }

    public int[][] antiDiagonals(int[][] A) {
        int[][] twodarray = new int[2 * A.length - 1][A.length];
        for (int i = 0; i < A[0].length; i++) {
            int row = 0, colom = i;
            while (row < A.length && colom >= 0) {
                twodarray[i][row] = A[row][colom];
                row++;
                colom--;
            }
        }
        for (int i = 1; i < A.length; i++) {
            int row = i, colom = A[0].length - 1;
            while (row < A.length && colom >= 0) {
                twodarray[i + A.length - 1][A.length - 1 - row] = A[colom][row];
                row++;
                colom--;
            }
        }
        return twodarray;
    }

}
