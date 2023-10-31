package com.practice.day22;

import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 09/10/23
 */
public class FindTwoMissingNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1, 2, 3, 6, 7, 8, 9, 10})));
    }

    public static int[] solve(int[] A) {
        int[] result = new int[2];
        int xor = 0;
        for(int i = 0; i < A.length + 2; i++){
            xor ^= i;
        }
        for(int i = 0; i < A.length; i++){
            xor ^= A[i];
        }
        int setBit = xor & ~(xor - 1);

        for(int i = 0; i < A.length; i++){
            if ((A[i] & setBit) != 0) {
                result[1] ^= i;
            } else {
                result[0] ^= i;
            }
        }

        for(int i =0; i < A.length + 2; i++){
            if ((i & setBit) != 0) {
                result[1] ^= i;
            } else {
                result[0] ^= i;
            }
        }
        if(result[0]>result[1]){
            int temp = result[0];
            result[0] =result[1];
            result[1] =temp;
        }
        return result;
    }


}
