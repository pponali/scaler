package com.ajet.module4.day29.additional;

import java.util.Arrays;

/**
 * @Author prakashponali
 * @Date 11/11/23
 * @Description Problem Description Given three integers A, B, and C, where A represents n, B represents r, and C
 * represents m, find and return the value of nCr % m where nCr % m = (n!/((n-r)!*r!))% m.
 * <p>
 * x! means factorial of x i.e. x! = 1 * 2 * 3... * x.
 * <p>
 * <p>
 * <p>
 * Problem Constraints 1 <= A * B <= 106
 * <p>
 * 1 <= B <= A
 * <p>
 * 1 <= C <= 106
 * <p>
 * <p>
 * <p>
 * Input Format The first argument given is integer A ( = n). The second argument given is integer B ( = r). The third
 * argument given is integer C ( = m).
 * <p>
 * <p>
 * Output Format Return the value of nCr % m.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = 5 B = 2 C = 13 Input 2:
 * <p>
 * A = 6 B = 2 C = 13
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * 10 Output 2:
 * <p>
 * 2
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * The value of 5C2 % 11 is 10. Explanation 2:
 * <p>
 * The value of 6C2 % 13 is 2.
 */
public class Compute_nCr_mod_m {

    public static void main(String[] args) {
        Compute_nCr_mod_m computeNCrModM = new Compute_nCr_mod_m();
        System.out.println(computeNCrModM.solve(6, 2, 13));
    }

    public int solve(int A, int B, int C) {

        int[][] ints = new int[A][A];
        for (int i = 0; i < A; i++) {
            ints[i][0] = ints[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ints[i][j] = ints[i - 1][j - 1] + ints[i - 1][j];
            }
        }
        System.out.println(Arrays.deepToString(ints));
        return ints[A - 1][B - 1];

    }
}
