package com.practice.day37;

import java.util.ArrayList;

public class Aggressive_cows {
    public static void main(String[] args) {
        Aggressive_cows aggressiveCows = new Aggressive_cows();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(32);
        list.add(45);
        list.add(67);

        aggressiveCows.solve(list, 3);
    }

    public int solve(ArrayList<Integer> A, int B) {

        int l = 0,h = 0,m = 0, ans = 0;
        while(l <= h){
            m = l + (h - l) / 2;
            if(check(A, B, m)){
                l = m + 1;
                ans = m;
            } else {
                h  = m - 1;
            }
        }
        return ans;
    }

    private boolean check(ArrayList<Integer> a, int b, int m) {
        int start = a.get(0);
        int count = 1;
        for(int i = 0; i < a.size(); i++){

        }

        return false;
    }
}
