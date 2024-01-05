package com.ajet.module4.day21;

/**
 * @author prakashponali
 * @Date 04/10/23
 */
public class NumberOf1sinNumber {
    public static void main(String[] args) {
        int A = 17;
        int count = 0;

        while(A > 0){
            if((A & 1) != 0){
                count++;
            }
            A = A >> 1;
        }
        System.out.println(count);
    }
}
