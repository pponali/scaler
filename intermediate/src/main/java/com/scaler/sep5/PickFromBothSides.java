package com.scaler.sep5;

public class PickFromBothSides {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{5, -2, 3 , 1, 2}, 3));
    }
    public static int solve(int[] A, int B) {
        int[] prefixsumarray = new int[A.length];
        int[] sufixsumarray = new int[A.length];
        prefixsumarray[0] = A[0];
        for(int i = 1; i < A.length; i++) {
            prefixsumarray[i] = prefixsumarray[i - 1] + A[i];
        }
        sufixsumarray[A.length - 1] = A[A.length - 1];
        for(int i = A.length - 2; i >= 0; i--) {
            sufixsumarray[i] = sufixsumarray[i + 1] + A[i];
        }
        int ans = Math.max(prefixsumarray[B - 1], sufixsumarray[A.length - B]), N = A.length;
        for(int i = 1; i < B; i++) {
            ans = Math.max(ans, prefixsumarray[i - 1] + sufixsumarray[N - B + i]);
        }
        return ans;


    }
}
