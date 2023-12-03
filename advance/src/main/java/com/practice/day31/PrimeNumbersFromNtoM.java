package com.practice.day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrimeNumbersFromNtoM {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(3, 18)));
    }
    public static int[] solve(int A, int B) {

        int[] primes = new int[Math.max(A, B)+1];
        for(int i = 1; i<primes.length;i++) primes[i] = i;
        for(int i =2; i * i < primes.length; i++){
            for(int j = i * i; j < primes.length; j = j + i){
                if(primes[j] != j){
                    continue;
                } else {
                    primes[j] = i;
                }
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = A ; i < primes.length; i ++){
            if(i == primes[i] && checkNumber(primes[i])){
                arr.add(primes[i]);
            }
        }
        int[] finalArr = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            finalArr[i] = arr.get(i);
        }
        return finalArr;
    }

    public static boolean checkNumber(int A){
        if(A < 10){
            if(A == 3)
                return true;
            else
                return false;
        }
        return checkNumber(A%10);
    }




}
