package com.practice.module4.day27;

/**
 * @author prakashponali
 * @Date 19/10/23
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
public class KthSymbolOptimized {

    public static void main(String[] args) {
        System.out.println(solve(50, 99L));
    }

    public static int solve(int A, Long B) {
        if (kthBit(A, B)) {
            return 1;
        } else {
            return 0;
        }
    }

    //Construct a binary tree with 1's and 0's
    //Here parent is previous row the means
    //Current row - 1 Ex: A-1
    //parent position is half of the current index. Ex: B/2
    public static boolean kthBit(int A, Long B) {

        if (B == 0) {
            return false;
        }
        //all even indexes are same as its parent index postion

        if (B % 2 == 0) {
            return kthBit(A - 1, B / 2);
        }
        //all odd indexes are opp to its parent index value
        else {
            return !kthBit(A - 1, B / 2);
        }
    }
}

