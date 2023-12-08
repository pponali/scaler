package com.practice.module5.day32.additional;

import java.util.HashMap;

public class LongestSubarrayZeroSum {

    public static void main(String[] args) {
        LongestSubarrayZeroSum longestSubarrayZeroSum = new LongestSubarrayZeroSum();
        System.out.println(longestSubarrayZeroSum.solve(new int[]{16,-16,3}));
    }

    public int solve(int[] A) {
            HashMap<Long, Integer> map = new HashMap<>();
            map.put(0L,0);
            Long prefix = 0L;
            int ans = 0;
            //we need to return the longest subarray
            //it is good to start the index with 1 for forming the ans variable.
            for(int i = 1; i <= A.length; i++){
                //prefix variable
                prefix += A[i - 1];
                //check if prefix exist or not
                if(map.get(prefix) != null){
                    ans = Math.max(ans, i - map.get(prefix));
                } else {
                    map.put(prefix, i);
                }
            }
            return ans;

        }

}
