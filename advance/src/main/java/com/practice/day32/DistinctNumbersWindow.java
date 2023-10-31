package com.practice.day32;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctNumbersWindow {

    public static void main(String[] args) {
        DistinctNumbersWindow distinctNumbersWindow = new DistinctNumbersWindow();
        distinctNumbersWindow.dNums(new int[]{1,2,3,4,5,6,7,8}, 3);
    }

    public int[] dNums(int[] A, int B) {
        ArrayList<Integer> count = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < B; i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        count.add(map.keySet().size());

        int s = 1, e = B;
        while(e < A.length){//next window
            map.put(A[s - 1], map.get(A[s - 1]) - 1);
            if(map.get(A[s - 1]) == 0){
                map.remove(A[s - 1]);
            }
            if(map.containsKey(A[e])){
                map.put(A[e], map.get(A[e]) + 1);
            } else {
                map.put(A[e], 1);
            }
            count.add(map.keySet().size());
            e++;s++;
        }
        return count.stream().mapToInt(Integer::intValue).toArray();
    }
}
