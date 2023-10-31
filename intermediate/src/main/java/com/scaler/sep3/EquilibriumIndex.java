package com.scaler.sep3;

public class EquilibriumIndex {

    public static void main(String[] args) {
        System.out.println(equilibriumIndex(new int[]{343,291,963,165,152}));
    }
    public static int equilibriumIndex(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j : A) {
            min = Math.min(min, j);
            max = Math.max(max, j);
        }
        int ans = A.length, minindex = -1, maxindex = -1;
        for(int i = 0; i < A.length; i++) {
            if(max == A[i]) {
                if(maxindex != -1) {
                    ans = Math.min(ans, i - minindex + 1);
                } else {
                    maxindex = i;
                    if(minindex != -1) {
                        ans = i - minindex + 1;
                    }
                }
            }
            if(min == A[i]) {
                if(minindex != -1) {
                    ans = Math.min(ans, i - maxindex + 1);
                } else  {
                    minindex = i;
                    if(maxindex == -1) {
                        ans = i - maxindex + 1;
                    }
                }
            }
        }
        return ans;
    }

}
