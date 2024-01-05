package com.ajet.module4.day26.additional;

/**
 * @author prakashponali
 * @Date 16/10/23
 * <p>
 * Problem Description On the first row, we write a 0. Now in every subsequent row, we look at the previous row and
 * replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 * <p>
 * Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= A <= 20
 * <p>
 * 0 <= B < 2A - 1
 * <p>
 * <p>
 * <p>
 * Input Format First argument is an integer A.
 * <p>
 * Second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format Return an integer denoting the Bth indexed symbol in row A.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = 3 B = 0 Input 2:
 * <p>
 * A = 4 B = 4
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 0 Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * Row 1: 0 Row 2: 01 Row 3: 0110 Explanation 2:
 * <p>
 * Row 1: 0 Row 2: 01 Row 3: 0110 Row 4: 01101001
 */
public class KthSymbol {

    public static void main(String[] args) {
        System.out.println(solve(7, 5));
    }

    public static int solve(int A, int B) {
        return solve(A, B, 1, "0") - 48;
    }

    public static int solve(int A, int B, int row, String string) {
        row = row + 1;
        string = string.replace("0", "X");
        string = string.replace("1", "10");
        string = string.replace("X", "01");

        if (row == A) {
            return string.charAt(B);
        }


        return solve(A, B, row, string);
    }
}
