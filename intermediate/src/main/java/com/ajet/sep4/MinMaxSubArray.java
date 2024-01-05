package com.ajet.sep4;

public class MinMaxSubArray {

    public static void main(String[] args) {
        System.out.println(minMaxSubArray(new int[]{814,761,697,483,981}));
    }
    public static int minMaxSubArray(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j : A) {
            min = Math.min(min, j);
            max = Math.max(max, j);
        }
        int ans = A.length, minindex = -1, maxindex = -1;
        for(int i = 0; i < A.length; i++) {
            if(min == A[i])
                minindex = i;
            if(A[i] == max)
                maxindex = i;
            if(minindex != -1 && maxindex != -1)
                ans = Math.min(ans, Math.abs(minindex - maxindex) + 1);
        }
        return ans;
    }
}
