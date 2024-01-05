package com.ajet.module4.day30;

import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 29/10/23
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        System.out.println(Arrays.toString(primeNumbers.solve(36)));
    }

    public boolean[] primes = null;

    public int[] solve(int A) {
        primes = new boolean[A + 1];
        primes[0] = primes [1] = true;
        for(int i  = 2; i <= A; i++) primes[i] = true;

        for(int i = 2 ; i * i <= A; i ++){
            if(primes[i]){
                for(int j = i * i; j <= A; j = j + i){
                    primes[j] = false;
                }
            }
        }

        int count = 0;
        for(int i = 2; i <= A; i++){
            if(primes[i]) count++;
        }
        int[] primeNumbers = new int[count];
        int j = 0;
        for(int i = 2; i <= A; i++){
            if(primes[i]) {
                primeNumbers[j] = i;
                j++;
            }
        }
        return primeNumbers;

    }
}
