package com.ajet.module4.day21;

/**
 * @author prakashponali
 * @Date 06/10/23
 */
public class UnSetIthBIT {
    public static void main(String[] args) {
        System.out.println(unsetIthBit(10, 3));
    }

    public static int unsetIthBit(int n, int i) {
        return n & ~(1 << i); // unset ith bit
    }
}
