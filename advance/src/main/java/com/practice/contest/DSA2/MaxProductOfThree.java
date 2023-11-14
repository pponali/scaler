package com.practice.contest.DSA2;

/**
 * @Author prakashponali
 * @Date 12/11/23
 * @Description
 */

import java.util.HashMap;
import java.util.Map;

public class MaxProductOfThree {
    public static int maxProduct(int[] nums) {
        int n = nums.length;

        // Initialize the hash table to store two smallest and three largest numbers
        Map<Integer, Integer> smallest = new HashMap<>();
        Map<Integer, Integer> largest = new HashMap<>();

        // Initialize the three largest variables
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        // Iterate through the array
        for (int num : nums) {
            // Update the three largest
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // Update the two smallest
            if (!smallest.containsKey(num) || smallest.get(num) < 2) {
                smallest.put(num, smallest.getOrDefault(num, 0) + 1);
            }

            // Update the three largest
            if (!largest.containsKey(num) || largest.get(num) < 3) {
                largest.put(num, largest.getOrDefault(num, 0) + 1);
            }
        }

        // Calculate the maximum product
        int product1 = max1 * max2 * max3;
        int product2 = Integer.MIN_VALUE;

        // Case 2: Product of two smallest negative numbers and the largest positive number
        for (Map.Entry<Integer, Integer> entry : smallest.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count >= 2) {
                product2 = Math.max(product2, num * num * max1);
            }
        }

        // Return the maximum of two cases
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {-9, -9, -7, -8, 6, 7, 6, 5, 2};
        int result = maxProduct(nums);
        System.out.println("Maximum Product of Three Elements: " + result);
    }
}

