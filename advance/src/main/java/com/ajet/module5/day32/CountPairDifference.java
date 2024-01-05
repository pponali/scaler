package com.ajet.module5.day32;

import java.util.HashMap;

public class CountPairDifference {

    public static void main(String[] args) {
        CountPairDifference countPairDifference = new CountPairDifference();
        System.out.println(countPairDifference.solve(new int[]{-6,2,10}, 8));
    }

    //this problem is on the hash map
    //we need to prepare the Hashmap in such away

    // to that it will track the frequency of the
    // of the elements.
    public int solve(int[] A, int B) {

        int count = 0;
        int mod =1000000007;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            count += map.getOrDefault(A[i] - B, 0) + map.getOrDefault(A[i] + B, 0);
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        
        return count % mod;
    }
}
