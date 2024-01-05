package com.ajet.module5.day31;

import java.util.Arrays;

public class PrimeSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(primesum(10)));
    }



    public static int[] primesum(int A) {

        int[]  primeNumbers = primeNumbersArray(10);
        int sum = A;
        int[] primeIndexes = new int[2];
        for(int i = 0; i < primeNumbers.length; i++){
            for(int j = i; j < primeNumbers.length; j++){
                if(primeNumbers[i] + primeNumbers[j] == sum){
                    primeIndexes[0] = primeNumbers[i];
                    primeIndexes[1] = primeNumbers[j];
                    return primeIndexes;
                }
            }
        }
        return primeIndexes;

    }

    static boolean[] primes = null;

    public static int[] primeNumbersArray(int n) {
        primes = new boolean[n + 1];
        for (int i = 0; i <= n; i++) primes[i] = true;
        primes[0] = primes[1] = false;
        for(int i = 2 ; i * i <= n; i++){
            if(primes[i]){
                for(int j = i * i ; j <= n ; j += i){
                    primes[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : primes) {
            if (prime) {
                count++;
            }
        }
        int[] primeNumbers = new int[count];
        int index = 0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                primeNumbers[index++] = i;
            }
        }

        return primeNumbers;

    }
}
