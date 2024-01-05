package com.ajet.module3.day12.additional;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the
 * strings in the array.
 * <p>
 * The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and
 * S2.
 * <p>
 * Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 * <p>
 * <p>
 * <p>
 * Problem Constraints 0 <= sum of length of all strings <= 1000000
 * <p>
 * <p>
 * <p>
 * Input Format The only argument given is an array of strings A.
 * <p>
 * <p>
 * <p>
 * Output Format Return the longest common prefix of all strings in A.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = ["abcdefgh", "aefghijk", "abcefgh"] Input 2:
 * <p>
 * A = ["abab", "ab", "abcd"];
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * "a" Output 2:
 * <p>
 * "ab"
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * Longest common prefix of all the strings is "a". Explanation 2:
 * <p>
 * Longest common prefix of all the strings is "ab".
 */
public class Longest_Common_Prefix {

    public static void main(String[] args) {
        Longest_Common_Prefix longestCommonPrefix = new Longest_Common_Prefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"asdfads","asdfasdf","asdfasd"}));
    }

    public String longestCommonPrefix(String[] A) {
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            minLength = Math.min(minLength, A[i].length());
        }
        String finalString = "";
        for (int i = 0; i < minLength; i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j].charAt(i) != A[j + 1].charAt(i)) {
                    break;
                }
            }
            finalString = finalString + A[0].charAt(i);
        }
        return finalString;
    }
}
