package com.ajet.module5.day32;

import java.util.HashSet;

public class CheckPairSum {

    public static void main(String[] args) {
        CheckPairSum checkPairSum = new CheckPairSum();
        System.out.println(checkPairSum.solve(100, new int[]{23,52,95,29,9,47,49,55,96,4}));
    }

    //this is hash set problem
    //condition is a[i] + a[j] = k
    //if a[i] is there in the hand
    // we need to check the compliment of int
    //that is a[j]
    //insert the items one after the other
    //into the hashset and check
    //the compliment is present in the hashset or not

    public int solve(int A, int[] B) {
        //declare hashset

        HashSet<Integer> set = new HashSet<>();
        //iterate over all the items and search for the complement
        for (int j : B) {
            //complement = target - a[i]
            int complement = A - j;
            //check if the complement present or not
            if (set.contains(j)) {
                return 1;
            } else {
                set.add(complement);
            }
        }
        return 0;
    }

}
