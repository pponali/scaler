package com.ajet.module3.day11.additional;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic
 * progression, otherwise return 0.
 * <p>
 * A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is
 * the same.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 2 <= N <= 105
 * <p>
 * -109 <= A[i] <= 109
 * <p>
 * <p>
 * <p>
 * Input Format The first and only argument is an integer array A of size N.
 * <p>
 * <p>
 * <p>
 * Output Format Return 1 if the array can be rearranged to form an arithmetic progression, otherwise return 0.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = [3, 5, 1] Input 2:
 * <p>
 * A = [2, 4, 1]
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 1 Output 2:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * We can reorder the elements as [1, 3, 5] or [5, 3, 1] with differences 2 and -2 respectively, between each
 * consecutive elements. Explanation 2:
 * <p>
 * There is no way to reorder the elements to obtain an arithmetic progression.
 */
public class Arithmetic_Progression {
    public static void main(String[] args) {

        Arithmetic_Progression arithmeticProgression = new Arithmetic_Progression();
        int[] A = new int[]{9, 2, 7, 4, 5, 7, 6, 1};

        System.out.println(arithmeticProgression.arithmeticProgression(A));
        int[] B = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(arithmeticProgression.arithmeticProgression(B));

    }

    public int arithmeticProgression(int[] A) {
        List<Integer> list = Arrays.stream(A).boxed().sorted().collect(Collectors.toList());
        int diff = 0;
        if (A.length >= 2) {
            diff = list.get(1) - list.get(0);
        } else {
            return -1;
        }
        for (int i = 1; i < A.length; i++) {
            if (diff != list.get(i) - list.get(i - 1)) {
                return -1;
            }
        }
        return 1;

    }
}
