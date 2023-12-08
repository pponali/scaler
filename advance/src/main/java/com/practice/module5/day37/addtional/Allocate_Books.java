package com.practice.module5.day37.addtional;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Allocate_Books {
    public static void main(String[] args) {
        Allocate_Books allocateBooks = new Allocate_Books();
        int[] ints = new int[]{};
        int B = 7;
        ArrayList<Integer> list = new ArrayList<>(IntStream.of(ints).boxed().toList());
        System.out.println(allocateBooks.solve(list, B));
    }

    private int solve(ArrayList<Integer> A, int B) {

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

    private boolean check(ArrayList<Integer> a, int b, int m) {

        return false;
    }
}
