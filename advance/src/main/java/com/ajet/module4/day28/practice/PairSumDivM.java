package com.ajet.module4.day28.practice;

import java.util.HashMap;

public class PairSumDivM {

    public static void main(String[] args) {
        System.out.println(pairSum(new int[]{12,16,8,4,23,45}, 4));
    }

    public static int pairSum(int[] A, int m){
        int count = 0;
        int[] modArray = new int[A.length];
        for(int i = 0; i < A.length; i++){
            modArray[i] = A[i] % m;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            map.put(modArray[i], map.getOrDefault(modArray[i], 0) + 1);
        }
        if(map.get(0) != null)
            count = map.get(0) * ((map.get(0) - 1) /2);
        if(m % 2 == 0 && map.get(m / 2) != null){
            count += map.get(m / 2) * ((map.get(m / 2) - 1) /2);
        }
        for(int i = 0; i < m / 2 + 1; i ++){
            if(map.get(i) != null && map.get(m - 1) != null)
                count += map.get(i) * map.get(m - 1);
        }

        return count;


    }
}
