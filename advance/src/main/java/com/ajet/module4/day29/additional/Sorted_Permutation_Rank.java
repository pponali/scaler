package com.ajet.module4.day29.additional;

/**
 * @Author prakashponali
 * @Date 11/11/23
 * @Description Problem Description Given a string A. Find the rank of the string amongst its permutations sorted
 * lexicographically. Assume that no characters are repeated.
 * <p>
 * Note: The answer might not fit in an integer, so return your answer % 1000003
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= |A| <= 1000
 * <p>
 * <p>
 * <p>
 * Input Format First argument is a string A.
 * <p>
 * <p>
 * <p>
 * Output Format Return an integer denoting the rank of the given string.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = "acb" Input 2:
 * <p>
 * A = "a"
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 2 Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * Given A = "acb". The order permutations with letters 'a', 'c', and 'b' : abc acb bac bca cab cba So, the rank of A is
 * 2. Explanation 2:
 * <p>
 * Given A = "a". Rank is clearly 1.
 */
public class Sorted_Permutation_Rank {

    private static final int MOD = 1000003;

    public int findRank(String A) {
        int n = A.length();
        long rank = 1;

        for (int i = 0; i < n; i++) {
            int smaller = 0;
            for (int j = i + 1; j < n; j++) {
                if (A.charAt(j) < A.charAt(i)) {
                    smaller++;
                }
            }

            rank = (rank + smaller * factorial(n - i - 1)) % MOD;
        }

        return (int) rank;
    }

    private long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * i) % MOD;
        }
        return result;
    }

    public static void main(String[] args) {
        Sorted_Permutation_Rank solution = new Sorted_Permutation_Rank();

        String A1 = "acb";
        String A2 = "a";

        System.out.println(solution.findRank(A1));  // Output: 2
        System.out.println(solution.findRank(A2));  // Output: 1
    }

}
