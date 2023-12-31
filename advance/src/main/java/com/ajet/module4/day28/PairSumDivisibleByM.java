package com.ajet.module4.day28;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author prakashponali
 * @Date 20/10/23
 * <p>
 * Problem Description Given an array of integers A and an integer B, find and return the number of pairs in A whose sum
 * is divisible by B.
 * <p>
 * Since the answer may be large, return the answer modulo (109 + 7).
 * <p>
 * Note: Ensure to handle integer overflow when performing the calculations.
 * <p>
 * <p>
 * Problem Constraints 1 <= length of the array <= 100000 1 <= A[i] <= 109 1 <= B <= 106
 * <p>
 * <p>
 * <p>
 * Input Format The first argument given is the integer array A. The second argument given is the integer B.
 * <p>
 * <p>
 * <p>
 * Output Format Return the total number of pairs for which the sum is divisible by B modulo (109 + 7).
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = [1, 2, 3, 4, 5] B = 2 Input 2:
 * <p>
 * A = [5, 17, 100, 11] B = 28
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 4 Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation Explanation 1: All pairs which are divisible by 2 are (1,3), (1,5), (2,4), (3,5). So total 4
 * pairs. Explanation 2: There is only one pair which is divisible by 28 is (17, 11)
 */
public class PairSumDivisibleByM {

    public static void main(String[] args) {
        int[] A = new int[]{93, 9, 46, 79, 56, 24, 10, 26, 9, 93, 31, 93, 75, 7, 4, 80, 19, 67, 49, 84, 62, 100, 17, 40, 35, 84, 14, 81, 99, 31, 100, 66, 70, 2, 11, 84, 60, 89, 13, 57, 47, 60, 59, 60, 42, 67, 89, 29, 85, 83, 42, 47, 66, 80, 88, 85, 83,
                82, 16, 23, 21, 55, 26, 2, 21, 92, 85, 26, 46, 3, 7, 95, 50, 22, 84, 52, 57, 44, 4, 23, 25, 55, 41, 49};

        //int[] C = new int[]{6, 7, 5, 11, 19, 20, 9, 15, 14, 13, 12, 23};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list = (ArrayList<Integer>) Arrays.stream(A).boxed().collect(Collectors.toList());
        System.out.println(solve(list, 37));

    }

    public static int solve(ArrayList<Integer> A, int B) {
        Map<Integer, Integer> map = new HashMap<>();
        //A = {18, 12, 6} B = 5
        //form an array with modulo of B with all the number in the array.
        //A = {3, 2, 1} B = 5
        //construct the map with frequency to find the sum whose sum is B.
        for (int i = 0; i < A.size(); i++) {
            int temp = A.get(i) % B;
            map.merge(temp, 1, Integer::sum);
        }
        //handling edge case
        //Case #1: when mod is 0
        int numberOfPairs = 0;
        if (map.get(0) != null && map.get(0) > 1) {
            numberOfPairs = (map.get(0) * (map.get(0) - 1)) / 2;
        }

        //incase of B is even
        //Case #2: when the given number(B) is even  exactly half when the
        if (map.get(B / 2) != null && B % 2 == 0) {
            numberOfPairs += map.get(B / 2) * (map.get(B / 2) - 1) / 2;
        }

        // check for the remaining elements for the pairs.
        // this statement holds good till you traverse the array to the mid.
        //other elements will come as pair for the elements that you have already iterated.
        int i = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext() && i < (map.entrySet().size() + 1) / 2) {
            Integer integer = iterator.next().getKey();
            if (map.get(integer) != null && map.get(B - integer) != null) {
                System.out.println("numberOfPairs  " + numberOfPairs + "  Integer : " + integer + " left side " + map.get(integer) + " right side " + map.get(B - integer));
                numberOfPairs += map.get(integer) * map.get(B - integer);
            }
            i++;
        }

        return numberOfPairs;

    }
}
