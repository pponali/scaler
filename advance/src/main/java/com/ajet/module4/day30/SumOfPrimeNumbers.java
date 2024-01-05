package com.ajet.module4.day30;

import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 29/10/23
 */
public class SumOfPrimeNumbers {

    public static void main(String[] args) {

        SumOfPrimeNumbers sumOfPrimeNumbers = new SumOfPrimeNumbers();
        int sum = 10;
        int[]  primeNumbers = sumOfPrimeNumbers.primeNumbersArray(sum);

        int[] primeIndexes = new int[2];
        for(int i = 0; i < primeNumbers.length; i++){
            for(int j = i; j < primeNumbers.length; j++){
                if(primeNumbers[i] + primeNumbers[j] == sum){
                    primeIndexes[0] = primeNumbers[i];
                    primeIndexes[1] = primeNumbers[j];
                    return;
                }
            }
        }
        System.out.println(Arrays.toString(primeIndexes));
    }

    boolean[] primes = null;

    public int[] primeNumbersArray(int n) {
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
