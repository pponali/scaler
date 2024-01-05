package com.practice.module2.day8;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description Problem Description Given an array A, find the size of the smallest subarray such that it contains at
 * least one occurrence of the maximum value of the array
 * <p>
 * and at least one occurrence of the minimum value of the array.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= |A| <= 2000
 * <p>
 * <p>
 * <p>
 * Input Format First and only argument is vector A
 * <p>
 * <p>
 * <p>
 * Output Format Return the length of the smallest subarray which has at least one occurrence of minimum and maximum
 * element of the array
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = [1, 3, 2] Input 2:
 * <p>
 * A = [2, 6, 1, 6, 9]
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 2 Output 2:
 * <p>
 * 3
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly. Explanation 2:
 * <p>
 * Take the last 3 elements of the array.
 */
public class Closest_MinMax {
    public static void main(String[] args) {
        Closest_MinMax closestMinMax = new Closest_MinMax();
        System.out.println(closestMinMax.closestMinMax(new int[]{814, 761, 697, 483, 981}));
        System.out.println(closestMinMax.closestMinMax(new int[]{1, 3, 2}));
        System.out.println(closestMinMax.closestMinMax(new int[]{2, 6, 1, 6, 9}));
    }

    public int closestMinMax(int[] A) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minIndex = 0, maxIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                maxIndex = i;
            }
            if (A[i] < min) {
                min = A[i];
                minIndex = i;
            }
        }
        return Math.abs(maxIndex - minIndex) + 1;
    }
}
