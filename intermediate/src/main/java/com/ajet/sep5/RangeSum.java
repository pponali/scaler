package com.ajet.sep5;

public class RangeSum {

    public static void main(String[] args) {
        System.out.println(rangeSum(new int[]{5,3,6,2,7,9,1,4,3,2,8}, 3,7));
        System.out.println(rangeSum(new int[]{5,3,6,2,7,9,1,4,3,2,8}, 2,5));
    }

    public static int rangeSum(int[] A, int i, int j) {


        for(int n = 1; n < A.length; n++) {
          A[n] = A[n - 1]  + A[n];
        }//TC=O(N)
        if(i == 0) {
            return A[j];
        } else {
            return A[j] - A[i - 1];
        }
    }
}
