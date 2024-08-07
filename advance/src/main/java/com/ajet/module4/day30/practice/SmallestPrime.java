package com.ajet.module4.day30.practice;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author prakashponali
 * @Date 11/11/23
 * @Description
 */
public class SmallestPrime {

    static int[] ints = new int[101];

    static int[] countOfFactors = new int[101];

    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        smallestPimeNumbers();
        System.out.println(Arrays.toString(ints));
        countOfFactors();
        System.out.println(Arrays.toString(countOfFactors));
    }

    public static void smallestPimeNumbers() {
        for (int i = 1; i < ints.length; i++) {
            ints[i] = i;
        }
        for (int i = 2; i * i < ints.length; i++) {
            if (ints[i] != i)
                continue;
            for (int j = i * i; j < ints.length; j = j + i) {
                if (ints[j] == j)
                    ints[j] = i;
            }
        }
    }

    public static void countOfFactors(){

        for(int i = 2; i < ints.length;i++) {
            int n = i;
            while (n > 1) {
                int smallestPrimeFactor = ints[n];
                if(i == 100){
                    System.out.println("test");
                }
                map.put(smallestPrimeFactor, map.getOrDefault(smallestPrimeFactor, 0) + 1);
                n = n / smallestPrimeFactor;
            }

            int sum = map.values().stream().map(value -> value + 1).mapToInt(Integer::intValue).reduce(1, (a, b) -> a * b);
            map.clear();
            countOfFactors[i] = sum;
        }
    }


}
