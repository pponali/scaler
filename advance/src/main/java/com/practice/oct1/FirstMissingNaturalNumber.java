package com.practice.oct1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Given an unsorted integer array, find the first missing positive integer.
 */
public class FirstMissingNaturalNumber {
    public static void main(String[] args) {
        System.out.println("test   " + firstMissingNaturalNumber(new ArrayList<>(Arrays.asList(2,3,1,2))));
    }
    public static int firstMissingNaturalNumber(ArrayList<Integer> A){

        for(int i = 0; i < A.size(); i++) {
            while(A.get(i) != i + 1 && A.get(i) > 0 && A.get(i) <= A.size()){
                if(Objects.equals(A.get(i), A.get(A.get(i) - 1))) {
                    break;
                }
                Integer temp = A.get(i);
                A.set(i, A.get(temp - 1));
                A.set(temp - 1, temp);
            }
        }
        for(int i = 0; i < A.size(); i++){
            if(A.get(i) != i + 1) {
                return i + 1;
            }
        }
        return A.size() + 1;
    }
}
