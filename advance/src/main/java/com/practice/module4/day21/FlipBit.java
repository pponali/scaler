package com.practice.module4.day21;

import java.util.Arrays;

/**
 * @author prakashponali
 * @Date 05/10/23
 */
public class FlipBit {

    public static void main(String[] args) {
        FlipBit f = new FlipBit();
        System.out.println(Arrays.toString(f.flip("1101111111")));
    }

    private int[] flip(final String A) {

        int left =0, right =0, currentsum =0, maxsum = 0;int[] ans = new int[2];

        for(int i =0;i < A.length(); i++){
            if(A.charAt(i) == '0'){
                currentsum++;
            } else {
                currentsum--;
            }
            if(currentsum > maxsum){
                maxsum = currentsum;
                ans[0] = left + 1;
                ans[1] = right + 1;
            }
            if(currentsum < 0){
                currentsum = 0;
                right = i + 1;
                left = i + 1;
            } else {
                right += 1;
            }
        }
        if(maxsum ==0)
        {
            return new int[0];
        }
        return ans;
    }
}
