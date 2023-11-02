package com.practice.day19;

public class SearchInMatrix {

    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{2,8,8,8},{2,8,8,8},{2,8,8,8}}, 8));
    }

    public static int solve(int[][] A, int B) {
        int i =0, j=A[0].length - 1, ans = Integer.MAX_VALUE;
        while(i < A.length && j >= 0) {
            if(A[i][j] == B) {
                ans = Math.min(ans, (i + 1) * 1009 + (j + 1));
            } else if(A[i][j] > B) {
                j--;
            } else if(A[i][j] < B) {
                i++;
                if(ans != Integer.MAX_VALUE)
                    return ans;
            }
        }
        if(ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans;
        }

    }
}
