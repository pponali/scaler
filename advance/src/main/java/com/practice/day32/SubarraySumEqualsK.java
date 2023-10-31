package com.practice.day32;

import java.util.HashSet;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();
        subarraySumEqualsK.solve(new int[]{-14,-9,12,7,-12,-4,7,25,-5,48,33,-49,36,-31,-48,36,36,17,13,-47,-39,37,-20,35,38,26,-40,-43,36,-48,-33,-30,6,-28,11,27,22,18,-21,-11,-50,34,-21,44,-25,17,34,-12,14,26,30} , 16);
    }

    public int solve(int[] A, int B) {

        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        for(int i = 1; i < A.length;i++){
            prefix[i] = prefix[i - 1] + A[i];
        }

        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i = 0; i < A.length; i++){
            if(prefix[i] == B){
                count++;
            }

            int target = prefix[i] - B;
            if(set.contains(target)) {
                count++;
            }  else {
                set.add(prefix[i]);
            }

        }
        return count;
    }
}
