package com.practice.module5.day32;

import java.util.HashMap;

public class DifferencePair {

    public static void main(String[] args) {
        DifferencePair differencePair = new DifferencePair();
        differencePair.solve( new int[]{2,1,2,1,2,1,2,1,2}, 1);
    }

    public int solve(int[] A, int B) {

        int count = 1;
        int mod =1000000007;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            int target = A[i] - B;
            if(map.containsKey(target)){
                if(count < 100){
                    count += map.get(target);
                } else  {
                    count = ((count *  mod) + map.get(A[i] * mod) * mod);
                }
            }
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        return count;
    }
}
