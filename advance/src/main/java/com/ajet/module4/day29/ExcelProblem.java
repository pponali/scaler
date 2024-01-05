package com.ajet.module4.day29;

/**
 * @author prakashponali
 * @Date 23/10/23
 * <p>
 * Problem Description Given a positive integer A, return its corresponding column title as it appears in an Excel
 * sheet.
 * <p>
 * For example:
 * <p>
 * 1 -> A 2 -> B 3 -> C ... 26 -> Z 27 -> AA 28 -> AB
 * <p>
 * <p>
 * Problem Constraints 1 <= A <= 109
 * <p>
 * <p>
 * <p>
 * Input Format First and only argument of input contains single integer A
 * <p>
 * <p>
 * <p>
 * Output Format Return a string denoting the corresponding title.
 * <p>
 * <p>
 * <p>
 * Example Input Input 1:
 * <p>
 * A = 3 Input 2:
 * <p>
 * <p>
 * A = 27
 * <p>
 * <p>
 * Example Output Output 1:
 * <p>
 * "C" Output 2:
 * <p>
 * "AA"
 * <p>
 * <p>
 * Example Explanation Explanation 1:
 * <p>
 * <p>
 * 3 corrseponds to C. Explanation 2:
 * <p>
 * 1 -> A, 2 -> B, 3 -> C, ... 26 -> Z, 27 -> AA, 28 -> AB
 */

//this problem is base 26
public class ExcelProblem {

    // comments for this method
    //  is for converting base 26 to base 10
    // base 26 is the number system with 26 characters
    // A = 1, B = 2, C = 3, D = 4, E = 5, F = 6, G = 7, H = 8, I = 9, J = 10, K = 11, L = 12, M = 13, N = 14, O = 15, P = 16, Q = 17, R = 18, S = 19, T = 20, U = 21, V = 22, W = 23, X = 24, Y = 25, Z = 26
    public static void main(String[] args) {
        System.out.println(convertToTitle(980097));
    }

    public static String convertToTitle(int A) {
        StringBuilder output = new StringBuilder();
        while (A > 0) {
            int mod = A % 26;
            if (mod == 0) {
                A = (A / 26) - 1;
                mod = 26;
            } else {
                mod = A % 26;
                A = A / 26;
            }
            output.append((char) ('A' + (mod - 1)));
        }
        return output.reverse().toString();
    }


    public String titleToNumber(int A) {
        StringBuilder builder = new StringBuilder();
        while (A > 0) {
            A--;
            builder.append('A' + (A % 26));
            A /= 26;
        }
        return builder.reverse().toString();
    }

    public static String titleToNumber2(int A) {

        StringBuilder builder = new StringBuilder();
        while (A > 0) {
            A--;
            builder.append((char) ('A' + (A % 26)));
            A /= 26;
        }
        return builder.reverse().toString();
    }

    public static int titleToNumber3(String A) {
        int result = 0;
        for (int i = 0; i < A.length(); i++) {
            result = result * 26 + (A.charAt(i) - 'A' + 1);
        }
        return result;
    }


    //module of nCr
    // C(n, r) = C(n, n-r)
    // C(n, r) = C(n-1, r-1) + C(n-1, r)
    // C(n, r) = C(n, n-r)
    // mod of C(n, r) = C(n, r) %
    public static int modOfMforNcr(int m, int n, int r) {

        if (n < r)
            return -1;
        int numerator = 0;//nCrModp(n, r, m);
        int denominator = 1;
        for (int i = 1; i <= r; i++)
            denominator = denominator * i % m;
        return (numerator * moduloInverse(denominator, m)) % m;
    }

    private static int moduloInverse(final int denominator, final int m) {
        return 0;//return power(denominator, m - 2, m); // (denominator^-1) % m = (denominator^(m-2)) % m
    }

    public int nCrModp(int n, int r, int p) {
        // p needs to be greater
        // than
        // n+r
        int C[] = new int[r + 1];
        C[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, r); j > 0; j--)
                C[j] = (C[j] + C[j - 1]) % p;
        }
        return C[r]; // C[r] contains nCR % p;
    }

    public static int moduloOfFraction(int A, int B) {
        if (B == 0) {
            return -1;
        }
        if (A == 0) {
            return 0;
        }
        if (A < 0) {
            A = A * -1;
        }
        if (B < 0) {
            B = B * -1;
        }
        if (A < B) {
            return A;
        }
        A = A - B;
        return moduloOfFraction(A, B);
    }
}
