package com.practice.day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Aggressive_cows {
    public static void main(String[] args) {
        Aggressive_cows aggressiveCows = new Aggressive_cows();
        int[] ints = new int[]{82,61,38,88,12,7,6,12,48,8,31,90,35,5,88,2,66,19,5,96,84,95};
        List<Integer> list = new ArrayList<>(IntStream.of(ints).boxed().toList());
        int max = 0;
        for(int i = 0; i < list.size(); i++){
            max = Math.max(max, list.get(i));
        }

        Collections.sort(list);

        System.out.println(aggressiveCows.solve(list, 8));
    }

    public int solve(List<Integer> A, int B) {

        int l = 1,h = A.get(A.size() - 1),m = 0, ans = 0;
        while(l <= h){
            m = l + (h - l) / 2;
            System.out.println("l  " + l + " h " + h + "  m  " + m);
            if(check(A, B, m)){
                l = m + 1;
                ans = m;
            } else {
                h  = m - 1;
            }
        }
        return ans;
    }

    private boolean check(List<Integer> a, int b, int m) {
        int start = a.get(0);
        int count = 1;
        System.out.println("a  " + a + "   b  " + b + "  m  " + m);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) - start >= m) {
                count++;
                start = a.get(i);
                if (count == b) {
                    return true;
                }
            }
        }
        return false;
    }
}
