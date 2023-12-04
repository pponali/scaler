package com.practice.day32;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();
        System.out.println(subarraySumEqualsK.solve(new int[]{19,-10,-13,10,-13,6,7,2,18,-19,-4}, 19));
    }

    public int solve(int[] A, int B) {


        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int prefix = 0;

        //construct a map in such a way that all the prefix elements are there
        //while doing that
        //check any complement prefix element is there are not.
        //if present increment the counter to those many occurrences.
        /*
        for(int i =0; i< A.length;i++){
            prefix += A[i];
            int complementElement = prefix - B;
            if(map.containsKey(complementElement)){
                count += map.getOrDefault(complementElement, 0);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        */
        map.put(0,1);
        for (int j : A) {
            prefix = prefix + j;
            if (map.containsKey(prefix - B)) {
                count += map.get(prefix - B);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}
