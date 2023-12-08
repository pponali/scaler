package com.practice.module2.day8.day8;

/**
 * @Author prakashponali
 * @Date 13/11/23
 * @Description You have given a string A having Uppercase English letters.
 * <p>
 * You have to find how many times subsequence "AG" is there in the given string.
 * <p>
 * NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= length(A) <= 105
 * <p>
 * <p>
 * <p>
 * Input Format First and only argument is a string A.
 * <p>
 * <p>
 * <p>
 * Output Format Return an integer denoting the answer.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = "ABCGAG" Input 2:
 * <p>
 * A = "GAB"
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 3 Output 2:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * Subsequence "AG" is 3 times in given string Explanation 2:
 * <p>
 * There is no subsequence "AG" in the given string.
 */
public class Special_Subsequences_AG {

    public static void main(String[] args) {
        Special_Subsequences_AG specialSubsequencesAg = new Special_Subsequences_AG();
        System.out.println(specialSubsequencesAg.specialSubsequencesAg("asdjflk;asdjfasdifowierjioe"));

    }

    public int specialSubsequencesAg(String s){
        int count = 0, ans = 0;
        for(int i = s.length() - 1; i > 0; i--){
            if(s.charAt(i) == 'G'){
                count++;
            }
            if(s.charAt(i) == 'A'){
                ans = ans + count;
            }
        }
        return ans % 1000000007;
    }
}
