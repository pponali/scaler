package com.ajet.aug31;

public class RemoveIntexSumOfEvenOdd {

    public static void main(String[] args) {
        int[] A = {3,-4,2,7,2,5,-3,6,8,10,-7};
        System.out.println(countOfSumofOddEvenIndesis(A));
    }

    public static int countOfSumofOddEvenIndesis(int[] A) {
        int count = 0;
        int[] B = new int[A.length - 1];
        int j = 0;
        for(int m = 0; m < A.length; m++) {
            for (int i = 0; i < A.length; i++) {
                if (i != j) {
                    B[i - 1] = A[i];
                }
            }
            j++;
            int[] prefixSumArray = new int[B.length];
            prefixSumArray[0] = B[0];
            int sumofevens = 0;
            int sumofodds = 0;
            if(prefixSumArray.length > 1) {
                for (int i = 1; i < B.length; i++) {
                    prefixSumArray[i] = prefixSumArray[i - 1] + B[i];
                }
                for (int i = 0; i < prefixSumArray.length; i++) {
                    if (i % 2 == 0) {
                        sumofevens += prefixSumArray[i];
                    } else {
                        sumofodds += prefixSumArray[i];
                    }
                }
            }
            if (sumofevens == sumofodds && sumofevens != 0) {
                count++;
            }

        }
        return count;
    }
}
