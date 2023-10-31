package com.scaler.sep7;

public class SlidingWindow {

    public static void main(String[] args) {
        System.out.println(sumOfArrayForGivenLength(new int[]{1,2,1,3,2}, 3,2));
    }

    public static int sumOfArrayForGivenLengthBF(int[] A, int m, int d) {
        int count = 0;
        int start = 0, end = m - 1;
        while(end < A.length - 1) {
            int sumofarray = 0;
            for(int i = start; i <= end; i++) {
                sumofarray += A[i];
            }
            if(d == sumofarray) {
                count++;
            }
            end++;start++;
        }
        return count;

    }

    public static int sumOfArrayForGivenLength(int[] A, int m, int d) {
        int count = 0;


        int sum = 0;
        for(int i = 0; i < d; i++) {
            sum += A[i];
        }
        if(sum == m) {
            count++;
        }
        for(int i = d; i < A.length; i++) {
            sum = sum + A[i];
            sum = sum - A[i - d];
            if(sum == m) {
                count++;
            }
        }
        return count;

    }

}
