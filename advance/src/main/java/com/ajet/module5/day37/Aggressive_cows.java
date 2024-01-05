package com.ajet.module5.day37;

import java.util.List;

public class Aggressive_cows {

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
