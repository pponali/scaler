package com.practice.day12;

/**
 * @Author prakashponali
 * @Date 14/11/23
 * @Description You are given a character string A having length N, consisting of only lowercase and uppercase latin
 * letters.
 * <p>
 * You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= N <= 105
 * <p>
 * A[i] ∈ ['a'-'z', 'A'-'Z']
 * <p>
 * <p>
 * <p>
 * Input Format First and only argument is a character string A.
 * <p>
 * <p>
 * <p>
 * Output Format Return a character string.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = "Hello" Input 2:
 * <p>
 * A = "tHiSiSaStRiNg"
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * hELLO Output 2:
 * <p>
 * ThIsIsAsTrInG
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * 'H' changes to 'h' 'e' changes to 'E' 'l' changes to 'L' 'l' changes to 'L' 'o' changes to 'O' Explanation 2:
 * <p>
 * "tHiSiSaStRiNg" changes to "ThIsIsAsTrInG".
 */
public class Toggle_Case {

    public static void main(String[] args) {
        Toggle_Case toggleCase = new Toggle_Case();
        System.out.println(toggleCase.toggleCase("AasdfJHKJHJKHkjasdfasd"));

    }

    public String toggleCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            } else {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        return new String(chars);

    }
}
