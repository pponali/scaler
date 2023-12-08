package com.practice.module5.day31;

/**
 * @author prakashponali
 * @Date 27/10/23
 */
public class UniqueElements {


    public static void main(String[] args) {
        System.out.println(sort(new int[]{51, 6, 10, 8, 22, 61, 56, 48, 88, 85, 21, 98, 81, 76, 71, 68, 18, 6, 14, 23, 72, 18, 56, 30, 97, 100, 81, 5, 99, 2, 85, 67, 46, 32, 66, 51, 76, 53, 36, 31, 81, 56, 26, 75, 69, 54, 54, 54, 83, 41, 86, 48, 7, 32, 85, 23, 47, 23, 18, 45, 79, 95, 73, 15, 55, 16, 66, 73, 13, 85, 14, 80, 39, 92, 66, 20, 22, 25, 34, 14, 51, 14, 17, 10, 100, 35, 9, 83, 31, 60, 24, 37, 69, 62}));
    }

    public static int solve(int[] A) {
        int max = 0, min = 0;
        for (int j : A) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }
        int[] B = new int[max - min + 1];
        for (int j : A) {
            B[j - min]++;
        }
        int ans = 0;
        for (int j : B) {
            if (j > 1)
                ans += j * ((j + 1) / 2);
        }
        return ans;

    }

    public static int sort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int j = i - 1;
            int current = A[i];
            while (j >= 0 && A[j] > current) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = current;
        }
        int ans = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                A[i + 1] += 1;
                ans++;
            }
            if (A[i] > A[i + 1]) {
                int diff = (A[i] - A[i + 1]);
                //System.out.println((A[i] - A[i + 1]));
                A[i + 1] += (A[i] - A[i + 1]) + 1;
                ans += diff + 1;
            }
        }
        return ans;
    }
}
