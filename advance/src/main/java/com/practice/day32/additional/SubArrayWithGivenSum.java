package com.practice.day32.additional;

import java.util.Arrays;
import java.util.HashMap;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        SubArrayWithGivenSum subArrayWithGivenSum = new SubArrayWithGivenSum();
        System.out.println(Arrays.toString(subArrayWithGivenSum.solve(new int[]{1, 2, 3, 4, 5}, 5)));
    }
    public int[] solve(int[] A, int B) {
        int prefix = 0;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            prefix += A[i];
            if(map.get(prefix - B) != null){
                ans[0] = map.get(prefix - B) + 2;
                ans[1] = i + 1;
                return ans;
            } else {
                map.put(prefix, i);
            }
        }
        return new int[]{-1};
    }
}
