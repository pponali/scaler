package com.practice.day31;

import java.util.HashMap;

/**
 * @author prakashponali
 * @Date 28/10/23
 */
public class NumberOfOpenDoors {
    public int[] spf = null;

    public static void main(String[] args) {
        NumberOfOpenDoors number = new NumberOfOpenDoors();
        System.out.println(number.solve(966482));
    }

    public int solve(int A) {
        return countOpenDoors(A);
    }


    public void seveArray() {
        for (int i = 0; i < spf.length; i++) {
            spf[i] = i;
        }
        for (int i = 2; i * i < spf.length; i++) {
            if (spf[i] != i) {
                continue;
            }
            if (i < Math.sqrt(spf.length))
                for (int j = i * i; j < spf.length; j += i) {
                    spf[j] = i;
                }
        }
    }

    public int countOpenDoors(int A) {
        spf = new int[A + 1];
        seveArray();
        int nuberOfOpenDoors = 1;
        for (int i = 2; i <= A; i++) {
            int numberOfFators = getNumberOfFactors(i);
            if (numberOfFators % 2 == 1) {
                nuberOfOpenDoors++;
            }
        }
        return nuberOfOpenDoors;

    }

    public int getNumberOfFactors(int number) {

        HashMap<Integer, Integer> map = new HashMap<>();

        while (number > 1) {
            int currentSpf = spf[number];
            if (map.containsKey(currentSpf)) {
                map.put(currentSpf, map.get(currentSpf) + 1);
            } else {
                map.put(currentSpf, 1);
            }
            number /= currentSpf;
        }
        return map.values().stream().map(value -> value + 1).mapToInt(Integer::intValue).reduce(1, (a, b) -> a * b);
    }
}
