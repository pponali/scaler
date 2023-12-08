package com.practice.module4.day21;

/**
 * @author prakashponali
 * @Date 06/10/23
 */
public class CheckBit {

    public static void main(String[] args) {
        System.out.println(solve(7, 2));
    }

    public static int solve(int A, int B) {
        if((A & (1 << B)) == 0)
            return 0;
        else
            return 1;
    }
}
