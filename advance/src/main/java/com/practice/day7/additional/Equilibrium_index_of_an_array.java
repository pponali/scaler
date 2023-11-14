package com.practice.day7.additional;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description <p></p> You are given an array A of integers of size N.
 * <p></p>
 * Your task is to find the equilibrium index of the given array
 * <p></p>
 * The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of
 * elements at higher indexes.
 * <p></p>
 * If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is
 * considered as 0.
 * <p></p>
 * Note:
 * <p></p>
 * Array indexing starts from 0. If there is no equilibrium index then return -1. If there are more than one equilibrium
 * indexes then return the minimum index.
 * <p></p>
 * <p>
 * Problem Constraints 1 <= N <= 105 -105 <= A[i] <= 105
 * <p></p>
 * <p>
 * Input Format First arugment is an array A .
 * <p></p>
 * <p>
 * Output Format Return the equilibrium index of the given array. If no such index is found then return -1.
 * <p></p>
 * <p>
 * Example Input Input 1: A = [-7, 1, 5, 2, -4, 3, 0] Input 2:
 * <p></p>
 * A = [1, 2, 3]
 * <p></p>
 * <p>
 * Example Output Output 1: 3 Output 2:
 * <p></p>
 * -1
 * <p></p>
 * <p>
 * Example Explanation Explanation 1: i   Sum of elements at lower indexes    Sum of elements at higher indexes 0
 *            0                                   7 1                  -7                                   6 2
 *         -6                                   1 3                  -1                                  -1 4
 *        1                                   3 5                  -3                                   0 6
 * 0                                   0
 * <p></p>
 * 3 is an equilibrium index, because: A[0] + A[1] + A[2] = A[4] + A[5] + A[6] Explanation 1:
 * <p></p>
 * i   Sum of elements at lower indexes    Sum of elements at higher indexes 0                   0
 *             5 1                   1                                   3 2                   3
 * 0 Thus, there is no such index.
 */
public class Equilibrium_index_of_an_array {

    public static void main(String[] args) {
        Equilibrium_index_of_an_array equilibriumIndexOfAnArray = new Equilibrium_index_of_an_array();
    }

    public int equilibriumIndexOfAnArray(int[] A) {
        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        if (prefix[0] == prefix[A.length - 1])
            return 0;
        for (int i = 1; i < A.length; i++) {
            if (prefix[i - 1] == prefix[A.length - 1] - prefix[i]) {
                return i;
            }
        }
        return -1;

    }
}
