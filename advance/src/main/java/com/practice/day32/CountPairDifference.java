package com.practice.day32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class CountPairDifference {

    public static void main(String[] args) {
        CountPairDifference countPairDifference = new CountPairDifference();
        System.out.println(countPairDifference.solve(new int[]{2,1,2,1,2,1,2,1,2}, 1));
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
            int target = 0;
            /**if(map.containsKey(A[i] - B)) {

             }


             count += map.get(target);

             }
             if(map.containsKey(A[i])){
             map.put(A[i], map.get(A[i]) + 1);
             } else {
             map.put(A[i], 1);
             } */

            count += map.getOrDefault(A[i] - B, 0) + map.getOrDefault(A[i] + B, 0);
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        //ArrayList<Integer> count = new ArrayList<>();
        //count.stream().mapToInt(Integer::intValue).toArray();
        return count % mod;
    }
}
