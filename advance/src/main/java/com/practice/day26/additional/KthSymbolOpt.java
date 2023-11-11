package com.practice.day26.additional;


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
 * Problem Constraints 1 <= A <= 105
 * <p>
 * 0 <= B <= min(2A - 1 - 1 , 1018)
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

public class KthSymbolOpt {

    public static void main(String[] args) {
        System.out.println(KthSymbol(8));
    }

    public static boolean KthSymbol(int A) {
        boolean currentValue = false;
        if (A == 0) {
            return false;
        }
        if (A % 2 == 0) {
            currentValue = KthSymbol(A / 2);
            System.out.println("CCC if " + currentValue + " A " + A);
            return currentValue;
        } else {
            currentValue = !KthSymbol(A / 2);
            System.out.println("CCC else " + currentValue + " A " + A);
            return currentValue;
        }
    }
}
