package com.practice.day38;

import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 10/11/23
 */
public class Pairs_with_Given_Difference {
    public static void main(String[] args) {

        Pairs_with_Given_Difference pairsWithGivenDifference = new Pairs_with_Given_Difference();
        System.out.println(pairsWithGivenDifference.solve(new int[]{1,8,2,8,8,8,8,4,4,6,10,10,9,2,9,3,7}, 1));

    }

    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int countOfPairs = 0;
        int i = 0, j = 1;
        while (j < A.length && i < A.length) {
            if (A[j] - A[i] == B) {
                int ii = i, jj = j;
                while (ii < A.length && A[ii] == A[i]) {
                    ii++;
                }
                i = ii;
                while (jj < A.length && A[jj] == A[j]) {
                    jj++;
                }
                j = jj;
                if(i != j)
                    countOfPairs++;
            } else if (A[j] - A[i] < B) {
                j++;
            } else {
                i++;
            }

        }
        return countOfPairs;
    }
}
