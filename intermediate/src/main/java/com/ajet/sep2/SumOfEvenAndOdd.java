package com.ajet.sep2;

public class SumOfEvenAndOdd {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3, 7, 1, 2, 3}));
    }

    public static int solve(int[] A) {
        int[] prefixeven = new int[A.length];
        prefixeven[0] = A[0];
        for(int i = 1; i < A.length; i++) {
            if(i % 2 == 0) {
                prefixeven[i] = prefixeven[i - 1] + A[i];
            } else {
                prefixeven[i] = prefixeven[i - 1];
            }
        }

        int[] prefixodd = new int[A.length];
        prefixodd[0] = 0;
        for(int i = 1; i < A.length; i++) {
            if((i & 1) == 1) {
                prefixodd[i] = prefixodd[i - 1] + A[i];
            } else {
                prefixodd[i] = prefixodd[i - 1];
            }
        }
        int se = 0, so = 0, count = 0, N = A.length;
        for(int i = 0; i < A.length; i++) {
            if(i == 0) {
                se = prefixodd[N-1];
                so = prefixeven[N-1] - prefixeven[i];
            } else {
                se = prefixeven[i - 1] + ( prefixodd[N-1] - prefixodd[i]);
                so = prefixodd[i - 1] + ( prefixeven[N - 1] - prefixeven[i]);
            }
            if(se == so) {
                count++;
            }
        }
        return count;

    }
}
