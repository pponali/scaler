package com.practice.module6.day58;

import java.util.HashMap;

public class LongestSubArrayZeroSum {

    /*public int solve(int[] A) {
        int[] prefix = new int[A.length];
        int max = Integer.MIN_VALUE;
        prefix[0] = A[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i < A.length; i++){
            if(map.get(prefix[i]) != null){
                max = Math.max(max, i - prefix[i]);
            } else {
                map.put(prefix[i], i);
            }
        }
        return max;
    }*/

    public static void main(String[] args) {
        LongestSubArrayZeroSum obj = new LongestSubArrayZeroSum();
        int[] A = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        System.out.println(obj.solve(A));
        System.out.println(obj.solve(new int[]{1, 2, 3}));
        System.out.println(obj.solve(new int[]{-1, -2, -3}));
        System.out.println(obj.solve(new int[]{1, -1, 1}));
        System.out.println(obj.solve(new int[]{1, 2, 3, 4}));
        System.out.println(obj.solve(new int[]{-1, -2, -3, -4}));
        System.out.println(obj.solve(new int[]{1, 2, 3, 4, 5}));
        System.out.println(obj.solve(new int[]{1, 2, 3, 4, 5, 6}));

    }

    private int solve(int[] a) {
        int mod = (int)Math.pow(10, 9) + 7;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            sum = (sum % mod + a[i] % mod) % mod;
            if(sum == 0){
                max = i + 1;
            } else if(map.get(sum) != null){
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}
