package com.practice.day21;

/**
 * @author prakashponali
 * @Date 17/10/23
 */
public class ToggleBit {

    public static void main(String[] args) {
        System.out.println(solve(50, 2));
        System.out.println(Integer.toBinaryString(50) + " " + 50);
        System.out.println(Integer.toBinaryString(solve(50, 2)) + " " + solve(50, 2));
    }

    public static int solve(int A, int B) {

        return (A ^ (1 << B));
    }
}
