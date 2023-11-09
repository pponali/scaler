package com.practice.sort;

import java.util.HashMap;

public class PairDiff {
    public int solve(int[] A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            map.put(A[i], map.getOrDefault(A[0], 0) + 1);
        }
        int count = 0;
        //A=3,5,1,2
        map.put(0,0);
        for(int i = 0; i < map.size()/2; i++){
            //if(map.get(i) != null && map.get())
            //count += map.getOrDefault(A[])
        }
        return  1;
    }
}
