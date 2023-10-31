package com.practice.day26;

/**
 * @author prakashponali
 * @Date 17/10/23
 */
public class IsMagicNumber {

    public static void main(String[] args) {
        System.out.println(solve(11));
    }

    public static int solve(int A) {
        return sum(A);

    }

    public static int sum(int A) {
        if (A < 10) {
            if (A == 1) {
                return 1;
            } else
                return 0;
        }
        int sum = 0;
        while (A != 0) {
            sum += A % 10;
            A /= 10;
        }

        return sum(sum);
    }
}
