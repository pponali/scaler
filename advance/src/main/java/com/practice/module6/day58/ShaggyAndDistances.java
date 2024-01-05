package com.practice.module6.day58;

import java.util.HashMap;

public class ShaggyAndDistances {

    public int solve(int[] A) {
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            Integer it = map.get(A[i]);
            if(it == null){
                map.put(A[i], i);
            } else {
                min = Math.min(min, i - it);
            }
        }
        if(min == Integer.MAX_VALUE){
            return -1;
        } else {
            return min;
        }
    }
}
