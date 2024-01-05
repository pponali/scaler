package com.ajet.module6.day58.addintional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;



public class SortArrayInGivenOrder {

    public int[] solve(int[] A, int[] B) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < B.length; i++) {
            if (map.get(B[i]) != null) {
                for (int j = 0; j < map.get(B[i]); j++) {
                    result.add(B[i]);
                }
                map.remove(B[i]);
            }
        }
        Map<Integer, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2));

        sortedMap.forEach((key, value) -> {
            for (int i = 0; i < value; i++) {
                result.add(key);
            }
        });

        return result.stream().mapToInt(Integer::intValue).toArray();

    }


}
