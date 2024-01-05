package com.ajet.module5.day38;

/**
 * @author prakashponali
 * @Date 10/11/23
 * <p>
 * Problem Description
 * <p>
 * Given a sorted array of integers (not necessarily distinct) A and an integer B, find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.
 * <p>
 * Since the number of such pairs can be very large, return number of such pairs modulo (109 + 7).
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 100000
 * <p>
 * 1 <= A[i] <= 10^9
 * <p>
 * 1 <= B <= 10^9
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument given is the integer array A.
 * <p>
 * The second argument given is integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the number of pairs for which sum is equal to B modulo (10^9+7).
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 1, 1]
 * B = 2
 * Input 2:
 * <p>
 * A = [1, 5, 7, 10]
 * B = 8
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 3
 * Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The pairs of A[i] and A[j] which sum up to 2 are (0, 1), (0, 2) and (1, 2).
 * There are 3 pairs.
 * Explanation 2:
 * <p>
 * There is only one pair, such that i = 0, and j = 2 sums up to 8.
 */
public class Pairs_with_given_sum_II {
    public static void main(String[] args) {
        Pairs_with_given_sum_II pairsWithGivenSumIi = new Pairs_with_given_sum_II();
        System.out.println(pairsWithGivenSumIi.solveScaler(new int[]{1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9}, 2));
    }

    public int solve(int[] A, int B) {
        int i = 0, j = A.length - 1, ans = 0;
        while (i < j) {
            if (A[i] + A[j] > B) {
                j--;
            } else if (A[i] + A[j] < B) {
                i++;
            } else {
                int ii = i;
                int jj = j;
                if (A[i] + A[j] == B) {
                    int count = j - i + 1;
                    ans += count * (count - 1) / 2;
                    break;
                } else {
                    while (ii < j && A[ii] == A[i]) {
                        ii++;
                    }
                    int count1 = ii - i;
                    while (jj > i && A[jj] == A[j]) {
                        jj--;
                    }
                    int count2 = j - jj;
                    i = ii;
                    j = jj;
                    ans += count2 * count1;
                }
            }
        }
        return ans;
    }

    public int solveScaler(int[] A, int B) {
        int i = 0, j = A.length - 1, mod = 1000 * 1000 * 1000 + 7;
        long ans = 0;
        while (i < j) {
            if (A[i] + A[j] == B) {
                int ii = i, jj = j;
                if (A[i] == A[j]) {
                    // equal A[i] and A[j]
                    long cnt = j - i + 1;
                    ans += (cnt * (cnt - 1) / 2) % mod;
                    ans %= mod;
                    break;
                } else {
                    // count number of elements with value A[i]
                    while (A[i] == A[ii]) {
                        ii++;
                    }
                    int cnt1 = ii - i;
                    i = ii;
                    // count number of elements with value A[j]
                    while (A[jj] == A[j]) {
                        jj--;
                    }
                    int cnt2 = j - jj;
                    j = jj;
                    ans += (cnt1 * cnt2) % mod;
                    ans %= mod;
                }
            } else if (A[i] + A[j] > B) {
                j--;
            } else i++;
        }
        return (int) ans;
    }
}
