package com.practice.day30;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author prakashponali
 * @Date 25/10/23
 */
public class CountOfDivisors {
    int[] smallestPrimeFactors = new int[1004];
    /**
     * @param args - args
     */
    public static void main(String[] args) {
        CountOfDivisors count = new CountOfDivisors();
        System.out.println(Arrays.toString(count.smallestPrimeFactorInTheRange(50)));


        System.out.println(Arrays.toString(count.solve(new int[]{4, 5, 101, 2, 7, 100})));

        //System.out.println(isPrime(10));
        //System.out.println(Arrays.toString(howManyPrimeNumber(50)));
        //System.out.println(Arrays.toString(printPrimeNumbers(1, 50)));

        //System.out.println(smallestPrimeFactor(50));
        //System.out.println(numberOfFactors(48));
       // System.out.println(Arrays.toString(solve(new int[]{4,5,1,2,7,3})));
    }

    /**
     * @param n - n
     * @return - boolean
     */
    public static boolean isPrime(int n) {
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * check prime numbers in a range
     *
     * @param B - Input
     * @return - calculated prime numbers
     */
    public static boolean[] howManyPrimeNumber(int B) {
        boolean[] primes = new boolean[B + 1];
        primes[0] = primes[1] = true;

        Arrays.fill(primes, true);
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = i * i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                System.out.println(i);
            }
        }
        return primes;
    }

    /**
     * print prime numbers in a range
     *
     * @param A
     * @param B
     * @return
     */
    public static boolean[] printPrimeNumbers(int A, int B) {

        boolean[] primes = new boolean[B + 1 - A];
        Arrays.fill(primes, true);
        for (int i = 2; i * i <= primes.length; i++) {
            if (primes[i]) {
                for (int j = i * i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }

        }
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                System.out.println(i);
            }
        }
        return primes;
    }


    /**
     * @param A
     * @return
     */
    public  int[] smallestPrimeFactorInTheRange(int A) {

        for (int i = 0; i < smallestPrimeFactors.length; i++) {
            smallestPrimeFactors[i] = i;
        }
        for (int i = 2; i * i < smallestPrimeFactors.length; i++) {
            if (smallestPrimeFactors[i] != i)
                continue;

            for (int j = i * i; j < smallestPrimeFactors.length; j += i) {
                if (smallestPrimeFactors[j] == j)
                    smallestPrimeFactors[j] = i;
            }

        }
        return smallestPrimeFactors;
    }

    public static int smallestPrimeFactor(int A) {
        for (int i = 2; i * i < A; i++) {
            if (A % i == 0) {
                return i;
            }
        }
        return A;
    }

    public  int numberOfFactors(int A) {

        HashMap<Integer, Integer> map = new HashMap<>();
        while (A > 1) {
            int smallestPrimeFactor = smallestPrimeFactors[A];
            if (map.containsKey(smallestPrimeFactor)) {
                map.put(smallestPrimeFactor, map.get(smallestPrimeFactor) + 1);
            } else {
                map.put(smallestPrimeFactor, 1);
            }
            A = A / smallestPrimeFactor(A);
        }
        final int[] count = {1};
        map.values().forEach(integer -> {
            count[0] = count[0] * (integer + 1);
            map.values().stream().map(value -> value + 1).mapToInt(Integer::intValue).sum();

        });
        return count[0];
    }

    public  int numberOfFactorsForNumber(int A){
        // number of factors for a number is the product of the number of factors for each prime factor of the number
        // code for calculating the number of factors for a number is given below

        int number = A;
        int numberOfFactors = 1;
        while(number > 1){
            int smallestPrimeFactor = smallestPrimeFactors[number];
            numberOfFactors = numberOfFactors * (smallestPrimeFactor + 1);
            number = number / smallestPrimeFactor;
        }
        return numberOfFactors;
    }

    public int[] solve(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            if (A[i] == 0) {
                B[i] = 0;
            } else {
                HashMap<Integer, Integer> map = new HashMap<>();
                int X = A[i];
                while (X > 1) {
                    int smallestPrimeFactor = smallestPrimeFactors[X];
                    if (map.containsKey(smallestPrimeFactor)) {
                        map.put(smallestPrimeFactor, map.get(smallestPrimeFactor) + 1);
                    } else {
                        map.put(smallestPrimeFactor, 1);
                    }
                    X = X / smallestPrimeFactor(X);
                }
                sum = map.values().stream().map(value -> value + 1).mapToInt(Integer::intValue).reduce(1, (a, b) -> a * b);
            }
            B[i] = sum;

        }
        return B;
    }

    public static int smallestPrimeFactor1(int number) {
        int count = 1;
        for (int i = 2; i * i < number; i++) {
            if (number % i == 0) {
                return i;
            }
        }
        return count;
    }
}
