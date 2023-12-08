package com.practice.module4.day22;

/**
 * @author prakashponali
 * @Date 09/10/23
 */
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleOccurrenceOfThreeNumber(new int[]{7,7,6}));
    }

    private static int[] singleOccurrenceOfThreeNumber(final int[] ints) {
        int[] result = new int[2];
        int xor = 0;
        for (int i : ints) {
            xor ^= i;
        }
        int setBit = xor & ~(xor - 1);
        for (int i : ints) {
            if ((i & setBit) != 0) {
                result[0] ^= i;
            } else {
                result[1] ^= i;
            }
        }
        return result;
    }
}
