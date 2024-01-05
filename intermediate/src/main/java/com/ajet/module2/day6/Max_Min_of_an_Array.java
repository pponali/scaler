package com.ajet.module2.day6;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
 * <p>
 * <p>
 * Problem Constraints 1 <= N <= 105 -109 <= A[i] <= 109
 * <p>
 * <p>
 * Input Format First argument A is an integer array.
 * <p>
 * <p>
 * Output Format Return the sum of maximum and minimum element of the array
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = [-2, 1, -4, 5, 3] Input 2:
 * <p>
 * A = [1, 3, 4, 1]
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 1 Output 2:
 * <p>
 * 5
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1. Explanation 2:
 * <p>
 * Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.
 */
public class Max_Min_of_an_Array {

    public static void main(String[] args) {
        Max_Min_of_an_Array maxMinOfAnArray = new Max_Min_of_an_Array();
        System.out.println(maxMinOfAnArray.maxMinOfAnArray(new int[]{1, 2, 3, 4, 5, 6, 6, 7, 8, 9}));

    }

    public int maxMinOfAnArray(int[] A) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int j : A) {
            min = Math.min(j, min);
            max = Math.max(j, max);

        }
        return max + min;
    }
}
